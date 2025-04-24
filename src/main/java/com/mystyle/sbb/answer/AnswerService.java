package com.mystyle.sbb.answer;

import java.time.LocalDateTime;

import com.mystyle.sbb.question.Question;
import org.springframework.stereotype.Service;
import com.mystyle.sbb.user.SiteUser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public void create(Question question, String content,SiteUser author) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateTime(LocalDateTime.now());
        answer.setQuestion(question);
        answer.setAuthor(author);
        this.answerRepository.save(answer);
    }
}
