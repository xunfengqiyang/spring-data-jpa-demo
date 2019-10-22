package com.tanjie.springdatajpademo.service;

import com.tanjie.springdatajpademo.entity.Group;
import com.tanjie.springdatajpademo.repository.GroupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Info
 *
 * @author: Jie.Tan
 * @verison: v1.0
 * @time: Created in 2019/10/22 4:21 PM
 */
@Service
public class GroupService {

    @Autowired
    GroupDao groupDao;

    public Group addGroup(String name) {

        Group group = new Group();
        group.setGroupName(name);
        groupDao.save(group);
        return group;
    }
}
