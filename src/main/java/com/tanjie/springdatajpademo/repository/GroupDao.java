package com.tanjie.springdatajpademo.repository;

import com.tanjie.springdatajpademo.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Info
 *
 * @author: Jie.Tan
 * @verison: v1.0
 * @time: Created in 2019/10/22 4:20 PM
 */
public interface GroupDao extends JpaRepository<Group, Long> {

}
