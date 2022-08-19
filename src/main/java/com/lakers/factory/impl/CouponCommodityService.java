package com.lakers.factory.impl;

import com.alibaba.fastjson.JSON;
import com.lakers.factory.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created on 2022/8/19 15:12
 *
 * @author Lakers
 */
public class CouponCommodityService implements ICommodity {

    private final Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap){
        // 业务处理
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", "0000");
    }
}
