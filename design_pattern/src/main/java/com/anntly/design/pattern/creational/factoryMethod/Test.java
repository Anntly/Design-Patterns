package com.anntly.design.pattern.creational.factoryMethod;

import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/210:06
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        VideoFactory pythonVideoFactory = new PythonVideoFactroy();
        VideoFactory FEVideoFactory = new FEVideoFactory();
        Video video = javaVideoFactory.getVideo();
        Video video1 = pythonVideoFactory.getVideo();
        Video video2 = FEVideoFactory.getVideo();
        video.produce();
        video1.produce();
        video2.produce();
    }
}
