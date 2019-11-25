package com.anntly.design.pattern.behavioral.strategy;

/**
 * @author soledad
 * @Title: NoneTranslateStrategy
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2011:07
 */
public class NoneTranslateStrategy implements TranslateStrategy{

    @Override
    public void translate(String statement) {
        System.out.println("暂未收录该语言");
    }
}
