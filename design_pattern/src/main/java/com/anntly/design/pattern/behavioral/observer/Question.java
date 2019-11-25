package com.anntly.design.pattern.behavioral.observer;

/**
 * @author soledad
 * @Title: Question
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2023:02
 */
public class Question {

    private String userName;

    private String questionContent;

    public Question(String userName, String questionContent) {
        this.userName = userName;
        this.questionContent = questionContent;
    }

    public String getUserName() {
        return userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }
}
