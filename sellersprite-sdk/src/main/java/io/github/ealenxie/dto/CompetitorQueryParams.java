package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/1 13:10
 **/
@Getter
@Setter
public class CompetitorQueryParams extends PageParams{

    /**
     * 市场
     */
    private String marketplace;
    /**
     * 查询日期条件
     */
    private String month;
    /**
     * 品牌
     */
    private String brand;

    /**
     * 卖家
     */
    private String sellerName;

    /**
     * asin
     */
    private List<String> asins;

    /**
     * 类目节点字符串
     */
    private String nodeIdPath;
    /**
     * true为类目精确查询
     * false为查询当前及子类目
     */
    private Boolean nodeIdPathEqual;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 关键字模式，
     * true=精确查找，
     * false=模糊查找，
     * 默认为true，最多支持200个字符
     */
    private Boolean keywordEqual;
    /**
     * 是否查询变体asin Y:否 N:是
     */
    private String variation;
    /**
     * 排序
     */
    private OrderParams order;
}

