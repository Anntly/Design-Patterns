package com.anntly.design.pattern.creational.factoryMethod;

/**
 * @author soledad
 * @Title: FEVideo
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/215:09
 */
public class FEVideo extends Video{
    @Override
    void produce() {
        System.out.println("正在录制FE视频");
    }
}
