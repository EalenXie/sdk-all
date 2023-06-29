package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConsignmentRefNoPayload {
    /**
     * 返回派送委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
    /**
     * 参考号（参考号和委托单号必须传入一个。两个参数同时传入时，只支持托单号查询。）
     */
    @JsonProperty("ref_no")
    private String refNo;
}
