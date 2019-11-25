package com.anntly.design.pattern.creational.factoryMethod;

/**
 * @author soledad
 * @Title: PythonVideoFactroy
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/215:08
 */
public class PythonVideoFactroy extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
