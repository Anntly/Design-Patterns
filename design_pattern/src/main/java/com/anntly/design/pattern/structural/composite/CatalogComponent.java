package com.anntly.design.pattern.structural.composite;

/**
 * @author soledad
 * @Title: CatalogComponent
 * @ProjectName design_pattern
 * @Description: 目录抽象类
 * @date 2019/7/1521:01
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
