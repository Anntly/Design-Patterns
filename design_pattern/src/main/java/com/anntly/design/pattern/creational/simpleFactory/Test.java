package com.anntly.design.pattern.creational.simpleFactory;

import org.slf4j.LoggerFactory;

import java.sql.DriverManager;
import java.util.Calendar;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/210:06
 */
public class Test {


//    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.produce();
//    }

//    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video java = videoFactory.getVideo("java");
//        Video python = videoFactory.getVideo("python");
//        if(null != java && null != python){
//            java.produce();
//            python.produce();
//        }
//    }

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        video.produce();
    }
}
