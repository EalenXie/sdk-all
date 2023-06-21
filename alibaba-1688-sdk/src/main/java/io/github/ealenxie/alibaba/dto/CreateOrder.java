package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2022/12/16 9:49
 */
@Setter
@Getter
public class CreateOrder {
    /**
     * 收货地址信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("addressParam")
    private AddressParam addressParam;
    /**
     * 商品信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("cargoParamList")
    private List<CargoParam> cargoParamList;
    /**
     * 发票信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("invoiceParam")
    private InvoiceParam invoiceParam;
    /**
     * general（创建大市场订单），saleproxy（创建分销订单）。saleproxy流程将校验分销关系,ttpft(批发团下单)
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("flow")
    private String flow;
    /**
     * 批发团instanceId,从alibaba.pifatuan.product.list获取
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("instanceId")
    private String instanceId;
    /**
     * 下游加密订单信息，用于下游打单使用
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("encryptOutOrderInfo")
    private EncryptOutOrderInfo encryptOutOrderInfo;
}
