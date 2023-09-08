package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/5 15:52
 **/
@Getter
@Setter
public class PredictionBsrQueryParams {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * asin
     */
    private String bsr;
    /**
     * 一级类目节点，查产品类目返回
     */
    private String categoryId;

}

