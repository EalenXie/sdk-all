package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 11:25
 */
@Getter
@Setter
public class GetXmsLabel {
    /**
     * 请求单号（支持4PX单号、客户单号和面单号）
     */
    @JsonProperty("request_no")
    private String requestNo;

    /**
     * 返回面单的格式（PDF：返回PDF下载链接；IMG：返回IMG图片下载链接）
     * <p>
     * 默认为PDF；
     */
    @JsonProperty("response_label_format")
    private String responseLabelFormat;

    /**
     * 是否打印当前时间（Y：打印；N：不打印）
     * <p>
     * 默认为N；
     */
    @JsonProperty("is_print_time")
    private String isPrintTime;

    /**
     * 是否打印买家ID（Y：打印；N：不打印）
     * <p>
     * 默认为N；
     */
    @JsonProperty("is_print_buyer_id")
    private String isPrintBuyerId;

    /**
     * 是否在标签上打印配货信息（Y：打印；N：不打印）；
     * <p>
     * 默认为N。
     * <p>
     * 注：只对4PX通用标签/普通标签的控制有效；这里的配货信息指是否在标签上打印配货信息。若需单独打印配货单，使用create_package_label字段控制。
     */
    @JsonProperty("is_print_pick_info")
    private String isPrintPickInfo;

    /**
     * 是否打印报关单（Y：打印；N：不打印）
     * <p>
     * 默认为N；
     */
    @JsonProperty("is_print_declaration_list")
    private String isPrintDeclarationList;

    /**
     * 报关单上是否打印客户预报重（Y：打印；N：不打印）
     * <p>
     * 默认为N。
     * <p>
     * 注：针对单独打印报关单功能；
     */
    @JsonProperty("is_print_customer_weight")
    private String isPrintCustomerWeight;

    /**
     * 是否单独打印配货单（Y：打印；N：不打印）
     * <p>
     * 默认为N。
     */
    @JsonProperty("create_package_label")
    private String createPackageLabel;

    /**
     * 配货单上是否打印配货条形码（Y：打印；N：不打印）
     * <p>
     * 默认为N。
     * <p>
     * 注：针对单独打印配货单功能；
     */
    @JsonProperty("is_print_pick_barcode")
    private String isPrintPickBarcode;

    /**
     * 是否合并打印(Y：合并；N：不合并)
     * <p>
     * 默认为N；
     * <p>
     * 注：合并打印，指若报关单和配货单打印为Y时，是否和标签合并到同一个URL进行返回
     */
    @JsonProperty("is_print_merge")
    private String isPrintMerge;

}
