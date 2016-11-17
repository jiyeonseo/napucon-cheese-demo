package com.example.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by jiyeon on 2016. 11. 17..
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GuguServiceTest {

    @Autowired
    GuguService guguService;

    @Test
    public void printGugu() throws Exception {
        guguService.printGugu();
    }

}