package br.com.rj.systems.customvalidation.validations.annotations;

import br.com.rj.systems.customvalidation.validations.validators.MaxSizeValidator;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = MaxSizeValidator.class)
public @interface MaxSizeValidation {

    String message() default "Test";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
