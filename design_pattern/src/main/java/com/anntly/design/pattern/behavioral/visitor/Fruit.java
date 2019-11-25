package com.anntly.design.pattern.behavioral.visitor;

import java.time.LocalDate;

/**
 * @author soledad
 * @Title: Fruit
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2322:20
 */
public class Fruit extends Product implements Accetable{

    private double weight;

    public Fruit(String name, LocalDate productDate, double price) {
        super(name, productDate, price);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
