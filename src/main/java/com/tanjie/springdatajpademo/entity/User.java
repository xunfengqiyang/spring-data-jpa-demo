package com.tanjie.springdatajpademo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Info
 *
 * @author: Jie.Tan
 * @verison: v1.0
 * @time: Created in 2019/10/11 9:12 PM
 */
@Entity
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Data
@Table(name = "t_user_info")
public class User {


    @Id//声明id为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//声明自动增长
    @Column(name = "id")//声明数据库对应的字段
    private Integer id;
    @Column(name = "user_name")//声明数据库对应的字段
    private String userName;
    @Column(name = "password")
    private String password;
}
