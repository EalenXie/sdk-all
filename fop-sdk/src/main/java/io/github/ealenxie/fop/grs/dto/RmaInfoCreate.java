package io.github.ealenxie.fop.grs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/27 15:13
 */
@Getter
@Setter
public class RmaInfoCreate {

    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("ref_no")
    private String refNo;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("services_product_code")
    private String servicesProductCode;
    @JsonProperty("received_shipping_no")
    private String receivedShippingNo;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("lstsku")
    private List<RmaInfoSku> skus;
}
