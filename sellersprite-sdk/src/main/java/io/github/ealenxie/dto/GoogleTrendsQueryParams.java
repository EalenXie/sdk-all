package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/4 16:48
 **/
@Getter
@Setter
public class GoogleTrendsQueryParams {

    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 类别
     */
    private String googleProp;
    /**
     * 按照月份
     */
    private Boolean monthly;
}

