package com.anntly.design.pattern.creational.factoryMethod;

/**
 * @author soledad
 * @Title: JavaVideo
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/210:04
 */
public class JavaVideo extends Video {

    @Override
    void produce() {
        System.out.println("正在录制Java视频");
    }
}
