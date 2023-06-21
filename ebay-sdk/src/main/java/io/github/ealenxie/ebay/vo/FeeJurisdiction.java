package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/18 17:06
 * @version 1.0
 */
@Getter
@Setter
public class FeeJurisdiction {
    /**
     * 地区名称
     * 例如：MX、IN、US、CA、VT、ME
     */
    @JsonProperty("regionName")
    private String regionName;
    /**
     * 地区类型
     */
    @JsonProperty("regionType")
    private String regionType;
}
