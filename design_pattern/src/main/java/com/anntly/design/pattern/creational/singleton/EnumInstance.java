package com.anntly.design.pattern.creational.singleton;

/**
 * @author soledad
 * @Title: EnumInstance
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/616:56
 */
public enum EnumInstance {
    INSTANCE{
        protected void printTest(){
            System.out.println("hello???");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
