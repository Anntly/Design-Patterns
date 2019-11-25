package com.anntly.design.pattern.behavioral.memento;

import java.util.Date;

/**
 * @author soledad
 * @Title: History
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2110:14
 */
public class History {
    private String title;

    private String content;

    private Date updateTime;

    public History(String title, String content, Date updateTime) {
        this.title = title;
        this.content = content;
        this.updateTime = updateTime;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
