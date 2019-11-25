package com.anntly.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @author soledad
 * @Title: ICourse
 * @ProjectName design_pattern
 * @Description: 课程接口
 * @date 2019/6/3010:14
 */
public interface ICourse {

    Integer getId();

    String getName();

    BigDecimal getPrice();
}
