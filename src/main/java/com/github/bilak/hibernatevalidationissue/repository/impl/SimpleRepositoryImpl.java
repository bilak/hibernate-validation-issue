package com.github.bilak.hibernatevalidationissue.repository.impl;

import com.github.bilak.hibernatevalidationissue.repository.SimpleRepository;

/**
 * @author Lukas Vasek
 */
public class SimpleRepositoryImpl implements SimpleRepository {

    @Override
    public String testNotEmpty(String test) {
        return "test";
    }
}
