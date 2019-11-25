package com.anntly.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author soledad
 * @Title: TranslateStrategyFactory
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2011:04
 */
public class TranslateStrategyFactory {

    private final static Map<String,TranslateStrategy> TRANSLATE_POOL = new HashMap<>();

    static {
        TRANSLATE_POOL.put(Language.ENGLISH,new EnglishTranslateStrategy());
        TRANSLATE_POOL.put(Language.CHINESE,new ChineseTranslateStrategy());
        TRANSLATE_POOL.put(Language.RUSSIAN,new RussianTranslateStrategy());
    }

    private TranslateStrategyFactory() {
    }

    private static final NoneTranslateStrategy noneTranslateStrategy = new NoneTranslateStrategy();

    public static TranslateStrategy getTranslateStrategy(String language){
        TranslateStrategy translateStrategy = TRANSLATE_POOL.get(language);
        return translateStrategy==null?noneTranslateStrategy:translateStrategy;
    }

    private interface Language{
        String ENGLISH = "ENGLISH";
        String CHINESE = "CHINESE";
        String RUSSIAN = "RUSSIAN";
    }
}
