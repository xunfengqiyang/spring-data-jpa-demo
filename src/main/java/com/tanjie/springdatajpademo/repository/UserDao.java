package com.tanjie.springdatajpademo.repository;

import com.tanjie.springdatajpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Info
 *
 * @author: Jie.Tan
 * @verison: v1.0
 * @time: Created in 2019/10/11 9:30 PM
 */
public interface UserDao extends JpaRepository<User, Integer> {

}
