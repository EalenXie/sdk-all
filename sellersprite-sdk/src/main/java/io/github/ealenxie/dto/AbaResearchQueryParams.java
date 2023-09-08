package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/5 14:54
 **/
@Getter
@Setter
public class AbaResearchQueryParams extends PageParams {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * 查询类型
     * W:按周
     * M:按月
     * 默认查周，即W
     */
    private String reverseType;
    /**
     * 和reverseType配合使用
     * reverseType=W或空时，查最新周
     * reverseType=M时，查最近30天
     */
    private String date;
    /**
     * 查询类目，见关键词选品类目接口，传递code
     */
    private List<String> departments;
    /**
     * 批量查询关键词
     */
    private List<String> keywordList;
    /**
     * 前三ASIN列表
     */
    private List<String> asins;
    /**
     * 排除关键字
     */
    private String excludeKeywords;
    /**
     * 包含关键词
     */
    private String includeKeywords;
    /**
     * 排除/包含关键词：是否精确匹配
     */
    private Boolean exactFlag;
    /**
     * 搜索增长量
     */
    private Integer rankGrowthValue;
    /**
     * 搜索增长率
     */
    private BigDecimal rankGrowthRate;
    /**
     * 最小排名增长率
     */
    private BigDecimal minRankGrowthRate;
    /**
     * 最大排名增长率
     */
    private BigDecimal maxRankGrowthRate;
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
     * 最小搜索量
     */
    private Integer minSearches;
    /**
     * 最大搜索量
     */
    private Integer maxSearches;
    /**
     * 最小点击集中度
     */
    private BigDecimal minMonopolyClickRate;
    /**
     * 最大点击集中度
     */
    private BigDecimal maxMonopolyClickRate;
    /**
     * 最小转化占比
     */
    private BigDecimal minConversionRate;
    /**
     * 最大转化占比
     */
    private BigDecimal maxConversionRate;
    /**
     * 最小单词个数
     */
    private Integer minWordCount;

    /**
     * 最大单词个数
     */
    private Integer maxWordCount;
    /**
     * 最小SPR
     */
    private Integer minSPR;

    /**
     * 最大SPR
     */
    private Integer maxSPR;
    /**
     * 最小标题密度
     */
    private Integer minTitleDensity;
    /**
     * 最大标题密度
     */
    private Integer maxTitleDensity;
    /**
     * 搜索模式：
     * 1：热门市场
     * 2：异动市场
     * 3：持续增长市场
     * 4：快速飙升市场
     * 5：潜力市场
     * 6：长尾市场
     */
    private Integer searchModel;
    /**
     * 排序
     */
    private OrderParams order;
}

