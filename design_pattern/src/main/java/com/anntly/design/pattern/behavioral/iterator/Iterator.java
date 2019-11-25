package com.anntly.design.pattern.behavioral.iterator;

/**
 * @author soledad
 * @Title: Iterator
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/1922:48
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
