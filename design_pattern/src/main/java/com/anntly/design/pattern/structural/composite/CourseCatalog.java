package com.anntly.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author soledad
 * @Title: CourseCatalog
 * @ProjectName design_pattern
 * @Description: 课程目录
 * @date 2019/7/1521:18
 */
public class CourseCatalog extends CatalogComponent{

    private List<CatalogComponent> items = new ArrayList<>();

    private String name;

    private Integer level; // 控制输出空格

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("目录:"+this.name);
        for (CatalogComponent item : items) {
            if(this.level != null){
                for (int i = 0; i < this.level; i++) {
                    System.out.print(" ");
                }
            }
            item.print();
        }
    }
}
