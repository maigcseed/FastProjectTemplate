package com.sunliwei.practicer.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author fjy
 * @since 2020-11-17
 */
@TableName("user_info")
public class UserInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 性别（0-男， 1-女）
     */
    private Integer sex;

    /**
     * 出生年月日
     */
    private LocalDateTime birthDay;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UserInfoEntity{" +
        "id=" + id +
        ", phone=" + phone +
        ", nickName=" + nickName +
        ", sex=" + sex +
        ", birthDay=" + birthDay +
        ", email=" + email +
        ", password=" + password +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
