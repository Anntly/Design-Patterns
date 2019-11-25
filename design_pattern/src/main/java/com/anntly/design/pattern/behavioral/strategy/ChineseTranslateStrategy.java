package com.anntly.design.pattern.behavioral.strategy;

/**
 * @author soledad
 * @Title: ChineseTranslateStrategy
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2010:57
 */
public class ChineseTranslateStrategy implements TranslateStrategy{

    @Override
    public void translate(String statement) {
        System.out.println("翻译完成");
    }
}
