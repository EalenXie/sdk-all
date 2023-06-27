package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 12:21
 */

@Getter
@Setter
public class OutBoundBilling {

    /**
     * 出库委托单号（参考号和委托单号必须传入一个。两个参数同时传入时，只支持托单号查询。）
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

    /**
     * 参考号（参考号和委托单号必须传入一个。两个参数同时传入时，只支持托单号查询。）
     */
    @JsonProperty("ref_no")
    private String refNo;
}
