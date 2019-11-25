package com.anntly.design.pattern.behavioral.visitor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2322:25
 */
public class Test {

//    public static void main(String[] args) {
//        Candy candy = new Candy("金丝猴", LocalDate.of(2018,10,1),12d);
//        Visitor visitor = new DiscountVisitor(LocalDate.now());
//        visitor.visit(candy);
//    }

    public static final List<Accetable> shopCar = Arrays.asList(new Candy("金丝猴", LocalDate.of(2018,10,1),12d),
            new Wine("82年拉菲", LocalDate.of(2015,10,1),70000d),
            new Fruit("哈密瓜", LocalDate.of(2019,7,20),20d));

    public static void main(String[] args) {
        Visitor visitor = new DiscountVisitor(LocalDate.now());
        for (Accetable product : shopCar) {
            //visitor.visit(product);
            product.accept(visitor);
        }
    }
}
