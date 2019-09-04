package com.example.demo.test.controller;

import com.example.demo.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {
    @Autowired
    TestService testService;


    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return testService.hiService(name);
    }



    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = format.parse("2019-07-26");
            System.out.println(!parse.after(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
