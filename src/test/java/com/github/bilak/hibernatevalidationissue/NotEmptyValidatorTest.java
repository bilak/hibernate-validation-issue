package com.github.bilak.hibernatevalidationissue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.bilak.hibernatevalidationissue.repository.SimpleRepository;

/**
 * @author Lukas Vasek
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class NotEmptyValidatorTest {

    @Autowired
    private SimpleRepository simpleRepository;


    @Test
    public void testNotEmptyOnReturnType(){
        simpleRepository.testNotEmptyOnReturnType("test");
    }

    @Test
    public void testNotEmptyOnParameter(){
        simpleRepository.testNotEmptyOnParameter("test");
    }

    @Test
    public void testNotEmptyOnParameterAndReturnType() {
        simpleRepository.testNotEmptyOnParameterAndReturnType("test");
    }
}
