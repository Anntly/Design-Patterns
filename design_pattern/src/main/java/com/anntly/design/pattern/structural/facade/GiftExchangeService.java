package com.anntly.design.pattern.structural.facade;

/**
 * @author soledad
 * @Title: GiftExchangeService
 * @ProjectName design_pattern
 * @Description:
 * @date 2019/7/820:56
 */
public class GiftExchangeService {

    private PointPaymentService pointPaymentService = new PointPaymentService();

    private QualifyService qualifyService = new QualifyService();

    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointGift pointGift){
        if(qualifyService.isAvailable(pointGift)){
            // 资格校验通过
            if(pointPaymentService.pay(pointGift)){
                //积分支付成功
                String no = shippingService.shipGift(pointGift);
                System.out.println("订单号是:"+no);
            }
        }
    }
}
