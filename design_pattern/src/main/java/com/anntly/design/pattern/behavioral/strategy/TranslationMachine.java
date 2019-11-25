package com.anntly.design.pattern.behavioral.strategy;

/**
 * @author soledad
 * @Title: TranslationMachine
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2011:02
 */
public class TranslationMachine {

    private  TranslateStrategy translateStrategy;

    public TranslationMachine(TranslateStrategy translateStrategy) {
        this.translateStrategy = translateStrategy;
    }

    public void translate(String statement){
        translateStrategy.translate(statement);
    }
}
