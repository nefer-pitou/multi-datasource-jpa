package com.liyingyu.multiDatasource.entity.primary;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Yingyu Li
 * @create 2018-07-12 11:51
 **/

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User1 implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 自增id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    /**
     * 用户在小程序中的唯一识别id
     */
    @Column(name = "open_id")
    private String openId;
    /**
     * 用户在同一主体的多个小程序中的唯一识别id
     */
    @Column(name = "union_id")
    private String unionId;
    /**
     * 用户来源，从分享进来、直接搜索、从推广的渠道进来等
     */
    private Integer source = 0;
    /**
     * 用户第一次登录的时间
     */
    @Column(name = "first_login_time", columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP")
    private String firstLoginTime;
    /**
     * 用户最后一次登录时间
     */
    @Column(name = "last_login_time", columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP")
    private String lastLoginTime;
    /**
     * 所属appId
     */
    @Column(name = "app_id")
    private String appId;
    /**
     * 小程序名称
     */
    @Column(name = "app_name")
    private String appName;

}

