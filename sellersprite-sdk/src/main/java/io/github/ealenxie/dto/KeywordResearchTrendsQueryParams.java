package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/5 10:29
 **/
@Getter
@Setter
public class KeywordResearchTrendsQueryParams extends PageParams {

    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * 周日~周六，以周六的日期作为查询条件
     */
    private String weekly;
    /**
     * 查询类目，见关键词选品类目接口，传递code
     */
    private List<String> departments;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 排除关键字
     */
    private String excludeKeywords;
    /**
     * 精确匹配
     */
    private Boolean exactFlag;
    /**
     * 搜索增长量
     */
    private Integer searchRankCv;
    /**
     * 搜索量增长率
     */
    private BigDecimal searchRankCr;
    /**
     * 增长时间类型:
     * W1:近1周，W2:近2周W3:近3周，W4:近4周
     */
    private String rankGrowthType;
    /**
     * 最小搜索排名
     */
    private Integer minSearchRank;
    /**
     * 最大搜索排名
     */
    private Integer maxSearchRank;
    /**
     * 最小点击集中度
     */
    private BigDecimal minAraClickRate;
    /**
     * 最大点击集中度
     */
    private BigDecimal maxAraClickRate;
    /**
     * 排序
     */
    private OrderParams order;
}

