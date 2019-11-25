package com.anntly.design.pattern.behavioral.visitor;

/**
 * @author soledad
 * @Title: Visitor
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2322:21
 */
public interface Visitor {

    public void visit(Candy candy);
    public void visit(Wine wine);
    public void visit(Fruit fruit);
}
