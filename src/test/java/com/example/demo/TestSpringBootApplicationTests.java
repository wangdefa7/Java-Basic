package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class TestSpringBootApplicationTests {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @Test
    public void contextLoads() {
        Long l = 1564263110000L;
        System.out.println(sdf.format(l));
        try {
            System.out.println(sdf.parse("1970-01-01"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }





}
