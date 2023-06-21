package io.github.ealenxie.winit.oswh.inbound.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/3 13:25
 **/
@Getter
@Setter
public class QueryOrderDetail {
    /**
     * WINIT订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 返回结果是否包含包裹信息。
     * Y-是,N-否,
     * 默认N。
     */
    @JsonProperty("isIncludePackage")
    private String isIncludePackage;
}

