package com.anntly.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author soledad
 * @Title: TeamLeader
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/120:50
 */
public class TeamLeader {
    public int countCourse() {
        // 添加书籍
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Course course = new Course();
            courseList.add(course);
        }
        return courseList.size();
    }
}
