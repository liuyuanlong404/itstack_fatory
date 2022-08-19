package com.lakers.factory;

import com.lakers.factory.impl.CardCommodityService;
import com.lakers.factory.impl.CouponCommodityService;
import com.lakers.factory.impl.GoodsCommodityService;

/**
 * Created on 2022/8/19 15:22
 *
 * @author Lakers
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        }
        if (2 == commodityType) {
            return new GoodsCommodityService();
        }
        if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }
}
