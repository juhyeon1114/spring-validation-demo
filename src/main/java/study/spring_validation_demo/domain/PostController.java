package study.spring_validation_demo.domain;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.spring_validation_demo.exceptions.validationgroup.PostTitleValidationGroup;

@Slf4j
@RestController
@RequestMapping("/api/post")
public class PostController {

    @PostMapping("/valid")
    public PostRequest valid(@Valid @RequestBody PostRequest postRequest) {
        return postRequest;
    }

    @PostMapping("/validated")
    public PostRequest2 validated(@Validated(PostTitleValidationGroup.class) @RequestBody PostRequest2 postRequest) {
        return postRequest;
    }

    @PostMapping("/custom")
    public PostRequest3 custom(@Valid @RequestBody PostRequest3 postRequest) {
        return postRequest;
    }

}
