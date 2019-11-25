package com.anntly.design.principle.demeter;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/120:55
 */
public class Test {

    @org.junit.Test
    public void test1(){
        Boss boss = new Boss();
        boss.queryCourseNum(new TeamLeader());
    }
}
