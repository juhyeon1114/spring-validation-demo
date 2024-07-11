package study.spring_validation_demo.exceptions.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;
import study.spring_validation_demo.exceptions.annotation.CustomTitleValidation;

public class CustomTitleValidator implements ConstraintValidator<CustomTitleValidation, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return StringUtils.hasText(s) && "제목".equals(s);
    }

}
