package com.anntly.design.pattern.creational.factoryMethod;

/**
 * @author soledad
 * @Title: JavaVideoFactory
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/215:07
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
