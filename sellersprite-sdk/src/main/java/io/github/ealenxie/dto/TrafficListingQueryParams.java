package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/5 17:39
 **/
@Getter
@Setter
public class TrafficListingQueryParams {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * asin
     */
    private String asin;
    /**
     * 关联类型，见表2.2，必传，默认vav
     */
    private String relation;
}

