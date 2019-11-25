package com.anntly.design.pattern.behavioral.templatermethod;

/**
 * @author soledad
 * @Title: ACourse
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1821:26
 */
public abstract class ACourse {

    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needArticle()){
            this.makeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void makeArticle(){
        System.out.println("编写手记");
    }

    // 钩子方法(有的不需要手记)
    protected boolean needArticle(){
        return false;
    }

    abstract void packageCourse();
}
