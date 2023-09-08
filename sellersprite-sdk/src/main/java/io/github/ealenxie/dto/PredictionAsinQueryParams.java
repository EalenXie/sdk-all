package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/5 15:52
 **/
@Getter
@Setter
public class PredictionAsinQueryParams {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * asin
     */
    private String asin;
}

