package com.anntly.design.pattern.creational.simpleFactory;

/**
 * @author soledad
 * @Title: VideoFactory
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/210:16
 */
public class VideoFactory {

//    public Video getVideo(String type){
//        if(type.equalsIgnoreCase("java")){
//            return new JavaVideo();
//        }else if(type.equalsIgnoreCase("python")){
//            return new PythonVideo();
//        }else{
//            return null;
//        }
//    }

    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video)Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return video;
    }
}
