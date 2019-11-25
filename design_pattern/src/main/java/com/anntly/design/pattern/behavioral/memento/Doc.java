package com.anntly.design.pattern.behavioral.memento;

import java.util.Date;

/**
 * @author soledad
 * @Title: Doc
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2110:07
 */
public class Doc {

    private String title;

    private String content;

    private Date updateTime;

    public Doc() {
    }

    public Doc(String title, String content, Date updateTime) {
        this.title = title;
        this.content = content;
        this.updateTime = updateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public History createHistory(){ // 创建记录
        return new History(title,content,updateTime);
    }

    public void restorrHistory(History history){ // 回退
        this.title = history.getTitle();
        this.content = history.getContent();
        this.updateTime = history.getUpdateTime();
    }

    @Override
    public String toString() {
        return "Doc{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
