package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.winit.lma.dto.Receiver;
import io.github.ealenxie.winit.lma.dto.Shipper;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 15:58
 * @version 1.0
 */
@Getter
@Setter
public class OrderInfoVO {

    /**
     * winit订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 订单状态
     */
    @JsonProperty("status")
    private String status;
    /**
     * 卖家订单号
     */
    @JsonProperty("sellerOrderNo")
    private String sellerOrderNo;
    /**
     * winit产品名称
     */
    @JsonProperty("winitProductName")
    private String winitProductName;
    /**
     * winit产品编码
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * 收货人
     */
    @JsonProperty("receiver")
    private Receiver receiver;
    /**
     * 发货人信息
     */
    @JsonProperty("shipper")
    private Shipper shipper;
    /**
     * 包裹列表
     */
    @JsonProperty("parcelList")
    private List<OrderInfoParcel> parcelList;
}
