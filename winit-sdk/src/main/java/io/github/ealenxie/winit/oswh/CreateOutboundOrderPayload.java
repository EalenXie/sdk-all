package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * 创建出库单请求实体
 *
 * @author create by sch  2023/4/20 16:01
 * @version 1.0
 */
@Getter
@Setter
public class CreateOutboundOrderPayload {
    /**
     * 最后一公里派送方式编码
     */
    @JsonProperty("winitProductCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String winitProductCode;
    /**
     * 仓库编码
     */
    @JsonProperty("warehouseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCode;
    /**
     * 收货人类型，仅自提出库必填
     * OTHER：其他
     * FBA_NONVC：FBA转仓-非VC
     * FBA_VC：FBA转仓-VC
     * OTHER_TRANSFER：转第三方仓
     */
    @JsonProperty("consigneeType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String consigneeType;
    /**
     * 卖家订单号
     */
    @JsonProperty("shipperOrderNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipperOrderNo;
    /**
     * shipperOrderNo是否允许重复
     * Y:允许重复
     * N:不允许重复
     * 推荐填写N，可避免操作失误重复发货
     */
    @JsonProperty("isRepeat")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String isRepeat;
    /**
     * 库存类型
     * 2B：ToB整箱出库(必须大写)
     * 2C：ToC销售出库(必须大写)
     * 当为空时，默认为2C销售出库
     */
    @JsonProperty("inventoryServiceType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String inventoryServiceType;
    /**
     * 电商平台类型
     * ebay，Amazon，wish，tiktok， Other
     */
    @JsonProperty("storeType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String storeType;
    /**
     * 电商平台订单ID
     */
    @JsonProperty("platformOrderId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platformOrderId;
    /**
     * 平台账号ID（电商平台账号）
     */
    @JsonProperty("platformAccount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platformAccount;
    /**
     * 卖家VAT
     */
    @JsonProperty("VATNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String vATNo;
    /**
     * IOSS编码
     */
    @JsonProperty("iossNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String iossNo;
    /**
     * 收件人公司名称
     */
    @JsonProperty("buyerCompany")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String buyerCompany;
    /**
     * 收件人国家名称
     * 1.可填写英文全称
     * 2.可填写ISO国家二字码
     */
    @JsonProperty("receiverCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverCountry;
    /**
     * 城市
     */
    @JsonProperty("receiverCity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverCity;
    /**
     * 收件人州名称
     */
    @JsonProperty("receiverState")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverState;
    /**
     * 收件人姓名
     */
    @JsonProperty("receiverName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverName;
    /**
     * 邮政编码
     */
    @JsonProperty("receiverPostcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverPostcode;
    /**
     * 门牌号
     */
    @JsonProperty("receiverHouseNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverHouseNo;
    /**
     * 收件人街道1
     */
    @JsonProperty("receiverAddressLine1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverAddressLine1;
    /**
     * 收件人街道2
     */
    @JsonProperty("receiverAddressLine2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverAddressLine2;
    /**
     * 收件人电话
     */
    @JsonProperty("receiverPhone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverPhone;
    /**
     * 收件人电子邮箱
     */
    @JsonProperty("receiverEmail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverEmail;
    /**
     * 销售金额
     */
    @JsonProperty("salesAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal salesAmount;
    /**
     * 销售金额币种
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String currency;
    /**
     * 收件人VAT/EORI
     */
    @JsonProperty("receiverVATEORINo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverVATEORINo;
    /**
     * 商品明细
     */
    @JsonProperty("merchandiseList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Merchandise> merchandiseList;
    /**
     * 提货方,PL代表卖家自提 CY代表第三方物流公司自提
     */
    @JsonProperty("pickUpSupplier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pickUpSupplier;
    /**
     * 第三方物流公司名称
     * 当提货方（pickUpSupplier）为：CY时必填
     * 当提货方为（pickUpSupplier）：PL时去除该字段
     */
    @JsonProperty("logisticsSupplierName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String logisticsSupplierName;
    /**
     * 第三方物流公司快递单号或BOL
     * 当提货方（pickUpSupplier）为：CY时选填
     * 当提货方（pickUpSupplier）为：PL时去除该字段
     */
    @JsonProperty("selfPickTrackingOrBOLNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String selfPickTrackingOrBOLNo;
    /**
     * 增值服务列表
     */
    @JsonProperty("VASList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Vas> vASList;
}
