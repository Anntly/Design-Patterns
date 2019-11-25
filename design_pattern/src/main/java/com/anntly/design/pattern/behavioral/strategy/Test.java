package com.anntly.design.pattern.behavioral.strategy;


/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2011:12
 */
public class Test {

    public static void main(String[] args) {
        TranslationMachine translationMachine = new TranslationMachine(TranslateStrategyFactory.getTranslateStrategy("RUSSIAN"));
        translationMachine.translate("你好");
    }
}
