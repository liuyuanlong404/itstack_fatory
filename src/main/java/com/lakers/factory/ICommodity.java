package com.lakers.factory;

import java.util.Map;

/**
 * Created on 2022/8/19 15:08
 *
 * @author Lakers
 */
public interface ICommodity {

    /**
     * 发放奖品
     *
     * @param uId         用户id
     * @param commodityId 奖品id
     * @param bizId       业务id
     * @param extMap      业务参数
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap);
}
