package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 15:45
 * @version 1.0
 */
@Getter
@Setter
public class CalDeliveryFeePayload {

    /**
     * 国家编码
     */
    @JsonProperty("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String country;
    /**
     * 州编码
     */
    @JsonProperty("region")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String region;
    /**
     * 城市
     */
    @JsonProperty("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String city;
    /**
     * 邮编
     */
    @JsonProperty("zipCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String zipCode;
    /**
     * 虚拟仓编码
     */
    @JsonProperty("pickupAddressCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pickupAddressCode;
    /**
     * winitPSC编码
     */
    @JsonProperty("winitProductCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String winitProductCode;
    /**
     * 包裹列表
     */
    @JsonProperty("parcelList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ParcelPayload> parcelList;
}
