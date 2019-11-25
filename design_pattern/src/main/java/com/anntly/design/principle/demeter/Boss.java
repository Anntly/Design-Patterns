package com.anntly.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author soledad
 * @Title: Boss
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/120:50
 */
public class Boss {

    public void queryCourseNum(TeamLeader teamLeader){

        int num = teamLeader.countCourse();
        System.out.println("书籍数量:"+num);
    }
}
