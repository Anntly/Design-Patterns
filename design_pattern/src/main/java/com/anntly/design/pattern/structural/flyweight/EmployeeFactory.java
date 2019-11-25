package com.anntly.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author soledad
 * @Title: EmployeeFactory
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1121:09
 */
public class EmployeeFactory {

    private static final Map<String,Employee> POOL = new HashMap<>();

    public static Employee getManager(String department){

        Manager manager = (Manager) POOL.get(department);
        if(manager == null){
            manager = new Manager(department);
            System.out.println("创建部门经理:"+department);
            String reportContent = department+"部门报告内容如下...";
            manager.setReportContent(reportContent);
            System.out.println("创建报告:"+reportContent);
            POOL.put(department,manager);
        }
        return manager;
    }
}
