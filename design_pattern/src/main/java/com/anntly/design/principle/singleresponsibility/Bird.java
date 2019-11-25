package com.anntly.design.principle.singleresponsibility;

/**
 * @author soledad
 * @Title: Bird
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/6/3018:26
 */
public class Bird {

    public void mostMoveMode(String birdName){
        if(birdName.equals("鸵鸟")){
            System.out.println(birdName+"跑步");
        }else {
            System.out.println(birdName+"飞");
        }
    }
}
