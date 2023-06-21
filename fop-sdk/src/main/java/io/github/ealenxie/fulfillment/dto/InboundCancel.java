package io.github.ealenxie.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月28日 0028 16 33
 */
@Getter
@Setter
public class InboundCancel {
    /**
     * 入库委托单号 （入库委托或参考号必须填写一个）
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

    /**
     * 入库委托参考号 （入库委托或参考号必须填写一个）
     */
    @JsonProperty("ref_no")
    private String refNo;
}
