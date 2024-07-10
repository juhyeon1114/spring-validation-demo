package study.spring_validation_demo.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;
import lombok.Getter;

@Getter
public class PostRequest {

    @NotBlank
    String title;

    @NotBlank
    @Size(min = 10)
    String content;

    @NotNull
    @Size(min = 1, message = "최소 1개 입력")
    List<String> tags;

}
