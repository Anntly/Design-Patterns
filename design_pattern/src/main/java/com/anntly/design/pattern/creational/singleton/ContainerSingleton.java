package com.anntly.design.pattern.creational.singleton;


import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author soledad
 * @Title: ContainerSingleton
 * @ProjectName design_pattern
 * @Description: 容器单利模式
 * @date 2019/7/619:38
 */
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String,Object> singletonMap = new HashMap<>();

    public static void putInstance(String key,Object instance){
        if(StringUtils.isNoneBlank(key) && null != instance){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
