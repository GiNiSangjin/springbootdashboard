package com.mystyle.sbb.answer;
import java.util.Set;

import java.time.LocalDateTime;

import com.mystyle.sbb.user.SiteUser;
import com.mystyle.sbb.question.Question;
import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;

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

    private LocalDateTime modifyTime;

    @ManyToMany
    Set<SiteUser> voter;
}
