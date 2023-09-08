package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/5 11:14
 **/
@Getter
@Setter
public class KeywordResearchTrends implements Serializable {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * 关键字
     */
    private String keywords;
    /**
     * 关键词中文翻译
     */
    private String keywordCn;
    /**
     * 类目
     */
    private List<SearchDepartment> searchDepartments;
    /**
     * 搜索排名
     */
    private Integer searchRank;
    /**
     * 搜索增长量
     */
    private Integer searchRankCv;
    /**
     * 搜索量增长率
     */
    private BigDecimal searchRankCr;
    /**
     * 关键词关联asin
     */
    private List<RelationAsin> relationAsinList;
    /**
     * 点击前三ASIN
     */
    private List<AraAsin> araAsinList;
    /**
     * 前三点击比
     */
    private BigDecimal sumClickRate;
    /**
     * 转化总比
     */
    private BigDecimal sumConversionRate;
}

