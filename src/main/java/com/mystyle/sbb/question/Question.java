package com.mystyle.sbb.question;
import java.util.Set;

import java.time.LocalDateTime;
import java.util.List;

import com.mystyle.sbb.answer.Answer;
import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;
import com.mystyle.sbb.user.SiteUser;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length=200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createTime;

    @OneToMany(mappedBy = "question",cascade = CascadeType.REMOVE)
    private List<Answer> answers;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyTime;

    @ManyToMany
    Set<SiteUser> voter;
}
