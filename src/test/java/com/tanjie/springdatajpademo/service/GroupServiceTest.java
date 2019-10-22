package com.tanjie.springdatajpademo.service;

import com.tanjie.springdatajpademo.entity.Group;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Info
 *
 * @author: Jie.Tan
 * @verison: v1.0
 * @time: Created in 2019/10/22 4:22 PM
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupServiceTest {

    @Autowired
    GroupService groupService;

    private final static Logger logger = LoggerFactory.getLogger(GroupServiceTest.class);

    @Test
    public void addGroup() {

        String name = "group name";
        Group group = groupService.addGroup(name);
        logger.info(group.toString());
    }
}