package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 10:52
 */
@Getter
@Setter
public class ReturnItemListData {
    /**
     * skuCode
     */
    @JsonProperty("skuCode")
    private String skuCode;
    /**
     * cnName
     */
    @JsonProperty("cnName")
    private String cnName;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * isActive
     */
    @JsonProperty("isActive")
    private String isActive;
    /**
     * pageNo
     */
    @JsonProperty("pageNo")
    private Integer pageNo;
    /**
     * pageSize
     */
    @JsonProperty("pageSize")
    private Integer pageSize;
}
