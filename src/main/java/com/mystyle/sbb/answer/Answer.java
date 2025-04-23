package com.mystyle.sbb.answer;

import java.time.LocalDateTime;

import com.mystyle.sbb.user.SiteUser;
import com.mystyle.sbb.question.Question;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createTime;

    @ManyToOne
    private Question question;

    @ManyToOne
    private SiteUser author;
}
