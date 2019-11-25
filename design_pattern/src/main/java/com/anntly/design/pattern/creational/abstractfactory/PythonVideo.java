package com.anntly.design.pattern.creational.abstractfactory;

/**
 * @author soledad
 * @Title: PythonVideo
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/217:11
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
