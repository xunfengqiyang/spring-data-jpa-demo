package com.tanjie.springdatajpademo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Info
 *
 * @author: Jie.Tan
 * @verison: v1.0
 * @time: Created in 2019/10/22 4:17 PM
 */
@Entity
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Data
@Table(name = "t_group")
public class Group {

    @Id//声明id为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//声明自动增长
    private Integer id;
    private String groupName;

    @Column(columnDefinition = "VARCHAR(255) DEFAULT 'sys'")
    private String createBy="sys";
    @CreationTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private Date createDt;
    @Column(name = "update_by", columnDefinition = "VARCHAR(255) DEFAULT 'sys'")
    private String updateBy="sys";
    @UpdateTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updateDt;
    @Version
    private Integer version = 0;
}
