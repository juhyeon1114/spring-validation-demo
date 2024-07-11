package study.spring_validation_demo.exceptions.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import study.spring_validation_demo.exceptions.validator.CustomTitleValidator;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = CustomTitleValidator.class)
public @interface CustomTitleValidation {

    String message() default "커스텀 검증이다.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
