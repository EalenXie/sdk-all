package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/8/18 17:16
 */
@Getter
@Setter
public class UploadOrderLabelPayload {
    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
    /**
     * 物流跟踪号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;
    /**
     * 分拣码
     */
    @JsonProperty("package_area_code")
    private String packageAreaCode;
    /**
     * 面单内容
     */
    @JsonProperty("label_info")
    private LabelInfo labelInfo;
}
