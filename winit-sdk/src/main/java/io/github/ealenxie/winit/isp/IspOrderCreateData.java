package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 16:54
 */
@Getter
@Setter
public class IspOrderCreateData {


    /**
     * winit产品编码
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * 发货方式
     * P:Winit揽收
     * S:自发快递
     * T:卖家自送
     * C:中邮揽收（停用）
     * D:DHL揽收（停用）
     */
    @JsonProperty("dispatchType")
    private String dispatchType;
    /**
     * 寄件人地址Code
     */
    @JsonProperty("shipperAddrCode")
    private String shipperAddrCode;
    /**
     * 验货仓Code
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 卖家订单号
     */
    @JsonProperty("refNo")
    private String refNo;
    /**
     * ebay卖家ID
     */
    @JsonProperty("ebaySellerId")
    private String ebaySellerId;
    /**
     * 是否允许卖家订单号重复
     */
    @JsonProperty("isAllowRepeat")
    private String isAllowRepeat;
    /**
     * 发件人税号
     */
    @JsonProperty("vatNo")
    private String vatNo;
    /**
     * IOSS
     */
    @JsonProperty("iossNo")
    private String iossNo;
    /**
     * 发件人EORI
     */
    @JsonProperty("eoriNo")
    private String eoriNo;
    /**
     * 捡货条码/备注条码
     */
    @JsonProperty("pickUpCode")
    private String pickUpCode;
    /**
     * 收件人公司
     */
    @JsonProperty("buyerCompany")
    private String buyerCompany;
    /**
     * 收件人国家
     */
    @JsonProperty("buyerCountry")
    private String buyerCountry;
    /**
     * 收件人州
     */
    @JsonProperty("buyerState")
    private String buyerState;
    /**
     * 收件人城市
     */
    @JsonProperty("buyerCity")
    private String buyerCity;
    /**
     * 收件人城市
     */
    @JsonProperty("buyerZipCode")
    private String buyerZipCode;
    /**
     * 收件人邮箱
     */
    @JsonProperty("buyerEmail")
    private String buyerEmail;
    /**
     * 收件人名字
     */
    @JsonProperty("buyerName")
    private String buyerName;
    /**
     * 收件人电话
     */
    @JsonProperty("buyerContactNo")
    private String buyerContactNo;
    /**
     * 收件人门牌号
     */
    @JsonProperty("buyerHouseNo")
    private String buyerHouseNo;
    /**
     * 收件人税号
     */
    @JsonProperty("recipientTaxID")
    private String recipientTaxID;
    /**
     * 收件人地址1
     */
    @JsonProperty("buyerAddress1")
    private String buyerAddress1;
    /**
     * 收件人地址2
     */
    @JsonProperty("buyerAddress2")
    private String buyerAddress2;
    /**
     * 包裹列表
     */
    @JsonProperty("packageList")
    private List<IspOrderPackageData> packageList;
}
