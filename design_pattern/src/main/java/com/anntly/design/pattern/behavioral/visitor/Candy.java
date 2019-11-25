package com.anntly.design.pattern.behavioral.visitor;

import java.time.LocalDate;

/**
 * @author soledad
 * @Title: Candy
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2322:19
 */
public class Candy extends Product implements Accetable{

    public Candy(String name, LocalDate productDate, double price) {
        super(name, productDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
