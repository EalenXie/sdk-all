package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 13:49
 * @version 1.0
 */
@Getter
@Setter
public class ProductQueryParams {

    /**
     * country
     */
    @JsonProperty("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String country;
    /**
     * skuCode
     */
    @JsonProperty("skuCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String skuCode;
    /**
     * importCountryCode
     */
    @JsonProperty("importCountryCode")
    private String importCountryCode;
    /**
     * importEndTime
     */
    @JsonProperty("importEndTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String importEndTime;
    /**
     * importStartTime
     */
    @JsonProperty("importStartTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String importStartTime;
    /**
     * keyword
     */
    @JsonProperty("keyword")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String keyword;
    /**
     * keywordValue
     */
    @JsonProperty("keywordValue")
    private String keywordValue;
    /**
     * name
     */
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    /**
     * pageVo
     */
    @JsonProperty("pageVo")
    private PageParams pageVo;
}
