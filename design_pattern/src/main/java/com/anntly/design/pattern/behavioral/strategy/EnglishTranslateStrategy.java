package com.anntly.design.pattern.behavioral.strategy;

/**
 * @author soledad
 * @Title: EnglishTranslateStrategy
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2010:57
 */
public class EnglishTranslateStrategy implements TranslateStrategy{

    @Override
    public void translate(String statement) {
        // 对语言进行翻译
        System.out.println("Translation completed");
    }
}
