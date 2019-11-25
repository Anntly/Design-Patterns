package com.anntly.design.pattern.creational.abstractfactory;

/**
 * @author soledad
 * @Title: JavaVideo
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/217:11
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
