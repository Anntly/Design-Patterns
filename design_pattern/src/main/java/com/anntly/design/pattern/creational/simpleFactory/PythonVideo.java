package com.anntly.design.pattern.creational.simpleFactory;

/**
 * @author soledad
 * @Title: PythonVideo
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/210:05
 */
public class PythonVideo extends Video{
    @Override
    void produce() {
        System.out.println("正在录制Python视频");
    }
}
