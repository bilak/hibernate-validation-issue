package com.github.bilak.hibernatevalidationissue.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Lukas Vasek
 */
public class NotEmptyConstraintValidator implements ConstraintValidator<NotEmpty, Object> {

    @Override
    public void initialize(NotEmpty constraintAnnotation) {
    }

    @Override
    public boolean isValid(
            Object value,
            ConstraintValidatorContext context) {
        return value != null;
    }
}
