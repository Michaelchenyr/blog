package com.wh.query;

import java.util.Date;

public class ShowBlog {
    private Long id;
    private String flag;
    private String title;
    private String content;
    private Long typeId;
    private String firstPicture;
    private String description;
    private boolean recommend;
    private boolean published;
    private boolean shareStatement;
    private boolean appreciation;
    private boolean commentabled;
    private Date updateTime;

    public void setId(Long id) {
        this.id = id;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public void setShareStatement(boolean shareStatement) {
        this.shareStatement = shareStatement;
    }

    public void setAppreciation(boolean appreciation) {
        this.appreciation = appreciation;
    }

    public void setCommentabled(boolean commentabled) {
        this.commentabled = commentabled;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public String getFlag() {
        return flag;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getTypeId() {
        return typeId;
    }

    public String getFirstPicture() {
        return firstPicture;
    }

    public String getDescription() {
        return description;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public boolean isPublished() {
        return published;
    }

    public boolean isShareStatement() {
        return shareStatement;
    }

    public boolean isAppreciation() {
        return appreciation;
    }

    public boolean isCommentabled() {
        return commentabled;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
