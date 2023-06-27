package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 14:40
 */
@Getter
@Setter
public class GetEstimatedCost {
    /**
     * 请求单号(支持4PX单号、面单号、客户单号)； 若填写了请求单号，则其余请求字段将不会生效
     */
    @JsonProperty("request_no")
    private String requestNo;

    /**
     * 目的国家二字码（未填写请求单号时，必填）
     */
    @JsonProperty("country_code")
    private String countryCode;

    /**
     * 实重(单位g，未填写请求单号时，必填)，填写实重需小于1000000g
     */
    @JsonProperty("weight")
    private String weight;

    /**
     * 长(单位cm)；长宽高3个字段，填写了其中一个字段，其他2个字段需必填；小于1000cm并且保留2位小数
     */
    @JsonProperty("length")
    private String length;

    /**
     * 宽(单位cm)；长宽高3个字段，填写了其中一个字段，其他2个字段需必填；小于1000cm并且保留2位小数
     */
    @JsonProperty("width")
    private String width;

    /**
     * 高(单位cm)；长宽高3个字段，填写了其中一个字段，其他2个字段需必填；小于1000cm并且保留2位小数
     */
    @JsonProperty("height")
    private String height;

    /**
     * 货物类型(包裹：P；文件：D）
     * <p>
     * 默认值：P；
     */
    @JsonProperty("cargocode")
    private String cargoCode;

    /**
     * 物流产品代码列表；如填写了产品代码，则只会返回填写的产品代码的试算结果，最大200个产品
     */
    @JsonProperty("logistics_product_code")
    private List<String> logisticsProductCode;

    /**
     * 邮编
     */
    @JsonProperty("recipient_post_code")
    private String recipientPostCode;
}
