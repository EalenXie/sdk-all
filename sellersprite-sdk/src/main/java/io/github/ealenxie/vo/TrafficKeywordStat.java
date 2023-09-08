package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/5 17:04
 **/
@Getter
@Setter
public class TrafficKeywordStat {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * asin
     */
    private String asin;
    /**
     * 全部流量词条数
     */
    private Integer keywords;
    /**
     * 自然流量词条数
     */
    private Integer ranks;
    /**
     * 广告流量词条数
     */
    private Integer ads;
    /**
     * 最近计算时间
     */
    private Long calcTime;
    /**
     * 流量词类型统计
     */
    private BadgeCount badgeCount;
}

