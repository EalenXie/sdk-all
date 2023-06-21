package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 12:51
 */
@Getter
@Setter
public class GetXmsLabelList {


    @JsonProperty("request_no")
    private List<String> requestNo;
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;
    @JsonProperty("label_size")
    private String labelSize;
    @JsonProperty("is_print_time")
    private String isPrintTime;
    @JsonProperty("is_print_buyer_id")
    private String isPrintBuyerId;
    @JsonProperty("is_print_pick_info")
    private String isPrintPickInfo;
    @JsonProperty("is_print_customer_weight")
    private String isPrintCustomerWeight;
    @JsonProperty("is_print_pick_barcode")
    private String isPrintPickBarcode;
    @JsonProperty("create_package_label")
    private String createPackageLabel;
}
