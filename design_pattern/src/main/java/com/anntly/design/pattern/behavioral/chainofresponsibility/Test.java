package com.anntly.design.pattern.behavioral.chainofresponsibility;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2223:52
 */
public class Test {

    public static void main(String[] args) {
        Approver mother = new MotherApprover("黄");

        mother.setNextApprover(new DadApprover("张")).setNextApprover(new GirlApprover("王丽丽"));

        Man man = new Man();
        man.setHasCar(false);
        man.setHasMoney(false);
        man.setHasRoom(false);
        man.setName("面筋哥");

//        Man man1 = new Man();
//        man1.setHasCar(true);
//        man1.setHasMoney(true);
//        man1.setHasRoom(true);
//        man1.setName("王思聪");

        mother.think(man);
    }
}
