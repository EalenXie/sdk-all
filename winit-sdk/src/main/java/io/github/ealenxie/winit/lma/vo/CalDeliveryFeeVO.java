package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 15:51
 * @version 1.0
 */
@Getter
@Setter
public class CalDeliveryFeeVO {

    /**
     * winitPSC编码
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * winitPSC名称
     */
    @JsonProperty("winitProductName")
    private String winitProductName;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 总金额
     */
    @JsonProperty("totalAmount")
    private Double totalAmount;
    /**
     * 费用明细列表
     */
    @JsonProperty("chargeList")
    private List<ChargeVO> chargeList;
    /**
     * 包裹信息
     */
    @JsonProperty("parcelList")
    private List<ParcelVO> parcelList;
}
