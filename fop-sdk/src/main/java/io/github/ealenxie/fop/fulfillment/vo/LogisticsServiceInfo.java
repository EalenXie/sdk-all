package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月28日 0028 14 00
 */
@Getter
@Setter
public class LogisticsServiceInfo {
    /**
     * 物流产品代码。详细参考基础数据-获取物流产品代码
     */
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;
    /**
     * 签名服务 可选值：Y(选择签名服务)；N(不选择签名服务)；默认为N。
     */
    @JsonProperty("signature_service")
    private String signatureService;
    /**
     * 保险服务 可选值： 8Y(平邮保价); 5Y(挂号-快递保价); 6P(0.6%保险)。*注：如果选择保险服务后，insure_value（投保金额）必填。如果选择8Y(平邮保价)或5Y(挂号-快递保价)，投保金额必须在1.00到100.00之间。如果选择6P(0.6%保险），投保金额必须在200.00到9999999.00之间。
     */
    @JsonProperty("insure_services")
    private String insureServices;
    /**
     * 退件服务。 可选值：Y(选择退件服务)；N(不选择退件服务)；默认为N。
     */
    @JsonProperty("return_service")
    private String returnService;
    /**
     * 选择Y，则需要打印发货清单，选择N，则不需要打印发货清单。
     */
    @JsonProperty("print_delivery")
    private String printDelivery;
    /**
     * 选择F，使用4px发货清单；选择C，使用delivery_file透传的文件作为发货清单；当print_delivery选择Y，该字段必填。
     */
    @JsonProperty("print_delivery_mode")
    private String printDeliveryMode;
}
