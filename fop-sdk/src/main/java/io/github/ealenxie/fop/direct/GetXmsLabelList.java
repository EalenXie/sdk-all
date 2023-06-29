package io.github.ealenxie.fop.direct;

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

    /**
     * 请求单号（支持4PX单号、客户单号和面单号）；
     */
    @JsonProperty("request_no")
    private List<String> requestNo;

    /**
     * 物流产品代码
     */
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;

    /**
     * 标签尺寸
     */
    @JsonProperty("label_size")
    private String labelSize;

    /**
     * 是否打印时间
     */
    @JsonProperty("is_print_time")
    private String isPrintTime;

    /**
     * 是否打印买方id
     */
    @JsonProperty("is_print_buyer_id")
    private String isPrintBuyerId;

    /**
     * 是否打印选择信息
     */
    @JsonProperty("is_print_pick_info")
    private String isPrintPickInfo;

    /**
     * 是否打印客户重量
     */
    @JsonProperty("is_print_customer_weight")
    private String isPrintCustomerWeight;

    /**
     * 是否打印条形码
     */
    @JsonProperty("is_print_pick_barcode")
    private String isPrintPickBarcode;

    /**
     * 是否创建包装标签
     */
    @JsonProperty("create_package_label")
    private String createPackageLabel;
}
