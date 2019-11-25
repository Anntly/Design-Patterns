package com.anntly.design.pattern.creational.prototype;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/711:09
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始邮件模板");
        for (int i = 0; i < 5; i++) {
            Mail tempMail = (Mail) mail.clone(); //使用clone方法拷贝对象
            tempMail.setName("小"+i);
            tempMail.setEmailAddress(tempMail.getName()+"@qq.com");
            tempMail.setContent(tempMail.getName()+":邮件内容");
            MailUtil.sendMail(tempMail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
