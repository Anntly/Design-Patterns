package com.anntly.design.pattern.creational.prototype;

/**
 * @author soledad
 * @Title: Mail
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/711:03
 */
public class Mail implements Cloneable{

    private String name;
    private String emailAddress;
    private String content;

    public Mail(){
        System.out.println("调用构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
