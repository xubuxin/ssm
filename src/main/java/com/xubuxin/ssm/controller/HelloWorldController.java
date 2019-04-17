package com.xubuxin.ssm.controller;

import com.xubuxin.ssm.bean.Person;
import com.xubuxin.ssm.mapper.HelloWorldMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xubuxin
 * @date 2019/4/16 - 11:15
 */

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldMapper helloWorldMapper;

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public List<Person> selectPersons(){
        List<Person> people = helloWorldMapper.selectPeople();
        return people;
    }
}
