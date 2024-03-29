package com.tanjie.springdatajpademo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

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
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;

    @Column(name = "create_by", columnDefinition = "VARCHAR(255) DEFAULT 'sys'")
    private String createBy="sys";
    @CreationTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_dt", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private Date createDt;
    @Column(name = "update_by", columnDefinition = "VARCHAR(255) DEFAULT 'sys'")
    private String updateBy="sys";
    @UpdateTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "update_dt", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updateDt;
    @Version
    private Integer version = 0;
}
