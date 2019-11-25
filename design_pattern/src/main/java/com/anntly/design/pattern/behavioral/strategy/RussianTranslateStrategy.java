package com.anntly.design.pattern.behavioral.strategy;

/**
 * @author soledad
 * @Title: RussianTranslateStrategy
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2010:58
 */
public class RussianTranslateStrategy implements TranslateStrategy{
    @Override
    public void translate(String statement) {
        System.out.println("Перевод выполнен");
    }
}
