package study.spring_validation_demo.domain;

import lombok.Getter;
import study.spring_validation_demo.exceptions.annotation.CustomTitleValidation;

@Getter
public class PostRequest3 {

    @CustomTitleValidation
    String title;

}
