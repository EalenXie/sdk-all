package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/4 17:07
 **/
@Getter
@Setter
public class GoogleTrends {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * google trend链接
     */
    private String link;
    /**
     * 明细
     */
    private List<GoogleTrendsItem> items;

}

