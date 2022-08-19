package com.lakers.factory.impl;

import com.alibaba.fastjson.JSON;
import com.lakers.factory.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created on 2022/8/19 15:15
 *
 * @author Lakers
 */
public class GoodsCommodityService implements ICommodity {

    private final Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        // 发放实物奖品
        Boolean isSuccess = this.deliverGoods(extMap);

        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);

        if (!isSuccess) {
            throw new RuntimeException("实物商品发放失败");
        }
    }

    private Boolean deliverGoods(Map<String, String> extMap) {
        return !extMap.isEmpty();
    }

}
