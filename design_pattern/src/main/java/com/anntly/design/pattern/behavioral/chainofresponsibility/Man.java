package com.anntly.design.pattern.behavioral.chainofresponsibility;

/**
 * @author soledad
 * @Title: Man
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/2223:27
 */
public class Man {

    private String name;

    private boolean hasRoom;

    private boolean hasMoney;

    private boolean hasCar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasRoom() {
        return hasRoom;
    }

    public void setHasRoom(boolean hasRoom) {
        this.hasRoom = hasRoom;
    }

    public boolean isHasMoney() {
        return hasMoney;
    }

    public void setHasMoney(boolean hasMoney) {
        this.hasMoney = hasMoney;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }
}
