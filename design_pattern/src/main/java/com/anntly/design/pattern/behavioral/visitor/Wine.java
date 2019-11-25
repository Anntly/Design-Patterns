package com.anntly.design.pattern.behavioral.visitor;

import java.time.LocalDate;

/**
 * @author soledad
 * @Title: Wine
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2322:19
 */
public class Wine extends Product implements Accetable{

    public Wine(String name, LocalDate productDate, double price) {
        super(name, productDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
