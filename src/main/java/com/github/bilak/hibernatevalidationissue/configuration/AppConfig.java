package com.github.bilak.hibernatevalidationissue.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.bilak.hibernatevalidationissue.repository.SimpleRepository;
import com.github.bilak.hibernatevalidationissue.repository.impl.SimpleRepositoryImpl;

/**
 * @author Lukas Vasek
 */
@Configuration
public class AppConfig {

    @Bean
    SimpleRepository simpleRepository() {
        return new SimpleRepositoryImpl();
    }

}