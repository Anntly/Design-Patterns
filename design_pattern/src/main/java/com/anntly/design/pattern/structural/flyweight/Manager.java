package com.anntly.design.pattern.structural.flyweight;

/**
 * @author soledad
 * @Title: Manager
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/1121:06
 */
public class Manager implements Employee{


    private String department; // 部门
    private String title; // 内部状态
    private String reportContent; // 报告内容 外部状态

    public Manager(String department){
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
