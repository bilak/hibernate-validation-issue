package com.github.bilak.hibernatevalidationissue.repository.impl;

import com.github.bilak.hibernatevalidationissue.repository.SimpleRepository;

/**
 * @author Lukas Vasek
 */
public class SimpleRepositoryImpl implements SimpleRepository {

    @Override
    public String testNotEmptyOnParameterAndReturnType(String test) {
        return test;
    }

    @Override
    public String testNotEmptyOnReturnType(String test) {
        return test;
    }

    @Override
    public String testNotEmptyOnParameter(String test) {
        return test;
    }
}
