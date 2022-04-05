package br.com.rj.systems.customvalidation.validations.validators;

import br.com.rj.systems.customvalidation.validations.annotations.MaxSizeValidation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MaxSizeValidator implements ConstraintValidator<MaxSizeValidation, Integer> {

    @Override
    public boolean isValid(Integer pageSize, ConstraintValidatorContext constraintValidatorContext) {
        if (pageSize > 1000) {
            throw new RuntimeException("Error in register");
        }
        return true;
    }
}
