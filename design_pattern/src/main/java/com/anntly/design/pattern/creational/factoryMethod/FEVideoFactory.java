package com.anntly.design.pattern.creational.factoryMethod;

/**
 * @author soledad
 * @Title: FEVideoFactory
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/215:10
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
