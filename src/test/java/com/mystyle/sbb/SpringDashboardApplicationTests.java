package com.mystyle.sbb;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import com.mystyle.sbb.answer.Answer;
import com.mystyle.sbb.question.QuestionService;
import com.mystyle.sbb.question.Question;
import com.mystyle.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class SpringDashboardApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for(int i = 1;i<=300;i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용 있음!";
            this.questionService.create(subject, content);
        }
    }

}
