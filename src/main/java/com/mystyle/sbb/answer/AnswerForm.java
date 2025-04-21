package com.mystyle.sbb.answer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
    @NotBlank(message="내용은 필수 항목입니다.")
    private String content;
}
