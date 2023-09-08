package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/4 9:55
 **/
@Getter
@Setter
public class TrafficKeyword {
    /**
     * 市场
     */
    private String marketplace;
    /**
     * asin
     */
    private String asin;
    /**
     * 总条数
     */
    private Integer total;
    /**
     * 词条
     */
    private List<TrafficKeywordItem> items;
    /**
     * 高频词
     */
    private List<HighFrequencyWords> stats;
}

