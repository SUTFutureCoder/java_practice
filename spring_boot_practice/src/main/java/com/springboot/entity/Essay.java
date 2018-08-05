package com.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "essay")
public class Essay {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 32)
    private String  essayId;

    @Column(length = 32)
    private String  essayTitle;
    private String  essayContent;
    private Integer contentType;
    private String  wishId;
    private Integer status;
    private String  createUser;
    private Integer createTime;
    private Integer updateTime;

    public String getEssayId() {
        return essayId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEssayId(String essayId) {
        this.essayId = essayId;
    }

    public String getEssayTitle() {
        return essayTitle;
    }

    public void setEssayTitle(String essayTitle) {
        this.essayTitle = essayTitle;
    }

    public String getEssayContent() {
        return essayContent;
    }

    public void setEssayContent(String essayContent) {
        this.essayContent = essayContent;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getWishId() {
        return wishId;
    }

    public void setWishId(String wishId) {
        this.wishId = wishId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Essay{" +
                "id=" + id +
                ", essayId='" + essayId + '\'' +
                ", essayTitle='" + essayTitle + '\'' +
                ", essayContent='" + essayContent + '\'' +
                ", contentType=" + contentType +
                ", wishId='" + wishId + '\'' +
                ", status=" + status +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
