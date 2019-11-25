package com.anntly.design.principle.singleresponsibility;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/6/3019:02
 */
public class Test {

    @org.junit.Test
    public void test1(){
        Bird bird = new Bird();
        bird.mostMoveMode("大雁");
        bird.mostMoveMode("鸵鸟");
    }

    @org.junit.Test
    public void test2(){
        FlyBird flyBird = new FlyBird();
        flyBird.mostMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mostMoveMode("鸵鸟");
    }
}
