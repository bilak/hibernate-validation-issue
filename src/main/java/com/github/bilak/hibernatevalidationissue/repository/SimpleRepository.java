package com.github.bilak.hibernatevalidationissue.repository;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

/**
 * @author Lukas Vasek
 */
@Validated
public interface SimpleRepository {

    @NotEmpty
    String testNotEmpty(@NotEmpty String test);
}
