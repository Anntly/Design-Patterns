package com.anntly.design.pattern.structural.facade;

/**
 * @author soledad
 * @Title: Test
 * @ProjectName design_pattern
 * @Description: TODO
 * @date 2019/7/821:00
 */
public class Test {

    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        PointGift pointGift = new PointGift("小黄书");
        giftExchangeService.giftExchange(pointGift);
    }
}
