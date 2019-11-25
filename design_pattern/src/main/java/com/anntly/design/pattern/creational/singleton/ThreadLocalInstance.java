package com.anntly.design.pattern.creational.singleton;

/**
 * @author soledad
 * @Title: ThreadLocalInstance
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/620:24
 */
public class ThreadLocalInstance {

    private ThreadLocalInstance(){}

    private static final ThreadLocal<ThreadLocalInstance> t = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue(){
            return new ThreadLocalInstance();
        }
    };

    public static ThreadLocalInstance getInstance(){
        return t.get();
    }
}
