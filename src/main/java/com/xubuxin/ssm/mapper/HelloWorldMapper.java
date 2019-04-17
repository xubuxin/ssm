package com.xubuxin.ssm.mapper;

import com.xubuxin.ssm.bean.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xubuxin
 * @date 2019/4/16 - 12:06
 */
@Repository
public interface HelloWorldMapper {
    List<Person> selectPeople();
}
