package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/6 10:11
 **/
@Getter
@Setter
public class TrafficStat {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * asin
     */
    private String asin;
    /**
     * 全部流量
     */
    private Integer freeRelations;
    /**
     * 免费流量
     */
    private Integer paidRelations;
    /**
     * 免费流量
     */
    private Long calcTime;
    /**
     * 统计概要
     */
    private TrafficStatItem items;
}

