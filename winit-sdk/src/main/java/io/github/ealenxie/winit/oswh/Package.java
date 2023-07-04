package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/20 17:24
 * @version 1.0
 */
@Getter
@Setter
public class Package {
    /**
     * 包裹中商品数量
     */
    @JsonProperty("itemqty")
    private Integer itemqty;
    /**
     * 订单处理完成时间(天）
     */
    @JsonProperty("serviceCompleteTime")
    private Integer serviceCompleteTime;
    /**
     * 准时派送
     */
    @JsonProperty("ontimeStatus")
    private String ontimeStatus;
    /**
     * 包裹跟踪号
     */
    @JsonProperty("trackingNos")
    private List<String> trackingNos;
    /**
     * 包裹重量Kg
     */
    @JsonProperty("weight")
    private Double weight;
    /**
     * 订单处理标准时间（天）
     */
    @JsonProperty("serviceStandardTime")
    private Integer serviceStandardTime;
    /**
     * 商品编码
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * 包裹编号
     */
    @JsonProperty("packageNum")
    private String packageNum;
    /**
     * 包裹状态编码
     */
    @JsonProperty("status")
    private String status;
}
