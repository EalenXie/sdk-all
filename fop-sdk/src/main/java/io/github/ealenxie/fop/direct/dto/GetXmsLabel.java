package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 11:25
 */
@Getter
@Setter
public class GetXmsLabel {

    @JsonProperty("request_no")
    private String requestNo;
    @JsonProperty("response_label_format")
    private String responseLabelFormat;
    @JsonProperty("is_print_time")
    private String isPrintTime;
    @JsonProperty("is_print_buyer_id")
    private String isPrintBuyerId;
    @JsonProperty("is_print_pick_info")
    private String isPrintPickInfo;
    @JsonProperty("is_print_declaration_list")
    private String isPrintDeclarationList;
    @JsonProperty("is_print_customer_weight")
    private String isPrintCustomerWeight;
    @JsonProperty("create_package_label")
    private String createPackageLabel;
    @JsonProperty("is_print_pick_barcode")
    private String isPrintPickBarcode;
    @JsonProperty("is_print_merge")
    private String isPrintMerge;

}
