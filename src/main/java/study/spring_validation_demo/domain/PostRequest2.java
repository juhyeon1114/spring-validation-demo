package study.spring_validation_demo.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;
import lombok.Getter;
import study.spring_validation_demo.exceptions.validationgroup.PostContentValidationGroup;
import study.spring_validation_demo.exceptions.validationgroup.PostTitleValidationGroup;

@Getter
public class PostRequest2 {

    @NotBlank(groups = {PostTitleValidationGroup.class})
    String title;

    @NotBlank(groups = {PostContentValidationGroup.class})
    @Size(min = 10, groups = {PostContentValidationGroup.class})
    String content;

    @NotNull
    @Size(min = 1, message = "최소 1개 입력")
    List<String> tags;

}
