package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/17 10:53
 */
@NoArgsConstructor
@Data
public class ReturnItem {
    /**
     * customerName
     */
    @JsonProperty("customerName")
    private String customerName;
    /**
     * importPrice
     */
    @JsonProperty("importPrice")
    private BigDecimal importPrice;
    /**
     * weight
     */
    @JsonProperty("weight")
    private Double weight;
    /**
     * originalCode
     */
    @JsonProperty("originalCode")
    private String originalCode;
    /**
     * registerWeight
     */
    @JsonProperty("registerWeight")
    private Double registerWeight;
    /**
     * width
     */
    @JsonProperty("width")
    private Double width;
    /**
     * code
     */
    @JsonProperty("code")
    private Double code;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * skuCode
     */
    @JsonProperty("skuCode")
    private String skuCode;
    /**
     * isActive
     */
    @JsonProperty("isActive")
    private String isActive;
    /**
     * registerLength
     */
    @JsonProperty("registerLength")
    private Double registerLength;
    /**
     * id
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * height
     */
    @JsonProperty("height")
    private Double height;
    /**
     * cnName
     */
    @JsonProperty("cnName")
    private String cnName;
    /**
     * customerCode
     */
    @JsonProperty("customerCode")
    private String customerCode;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * registerHeight
     */
    @JsonProperty("registerHeight")
    private Double registerHeight;
    /**
     * length
     */
    @JsonProperty("length")
    private Double length;
    /**
     * volume
     */
    @JsonProperty("volume")
    private Double volume;
    /**
     * registerWidth
     */
    @JsonProperty("registerWidth")
    private Double registerWidth;
    /**
     * registerVolume
     */
    @JsonProperty("registerVolume")
    private Double registerVolume;
}
