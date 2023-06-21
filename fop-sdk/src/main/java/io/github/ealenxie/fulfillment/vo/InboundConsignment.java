package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月27日 0027 13 23
 */
@Getter
@Setter
public class InboundConsignment {

    /**
     * 入库委托号，系统生成。如：IC900278180410099
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

    /**
     * 客户操作账号
     */
    @JsonProperty("customer_code")
    private String customerCode;

    /**
     * 入库委托参考号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * 入库上架仓库代码（详细参考公共服务，获取仓库代码）
     */
    @JsonProperty("to_warehouse_code")
    private String toWarehouseCode;

    /**
     * 入库委托状态。如：N（草稿）;S（待审批）;A（已审批）;B（预约中）;F（预约确认）;R（预约拒绝）;G（收货中）;V（已收货）;K（已查验）;H（已出库）;P（上架中）;C（已上架）;E（异常）;X（已取消）;D（已删除）
     */
    @JsonProperty("status")
    private String status;

    /**
     * 总体积（单位：立方米），精确到3位小数，如：150.336
     */
    @JsonProperty("total_volume")
    private String totalVolume;

    /**
     * 总重量(单位：kg 千克 )，精确到3位小数，如：250.33
     */
    @JsonProperty("total_weight")
    private String totalWeight;

    /**
     * 运输方式类型
     */
    @JsonProperty("transport_type")
    private String transportType;

    /**
     * 4PX跟踪号；入库委托创建成功后返回。4PX唯一单号；可跟进跟踪号在4PX轨迹系统查询轨迹信息。如：9082324423
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;

    /**
     * 物流产品代码。详细参考基础数据-获取物流产品代码
     */
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;

    /**
     * 单独报关。如：N(否);YRR (单独报关且退税); YNR(单独报关不退税); 默认为N。
     */
    @JsonProperty("customs_service")
    private String customsService;

    /**
     * 签名服务。如：Y(选择签名服务)；N(不选择签名服务)；默认为N。
     */
    @JsonProperty("signature_service")
    private String signatureService;

    /**
     * 柜箱号/物流单号。4PX运输物流单号。
     */
    @JsonProperty("shipping_no")
    private String shippingNo;

    /**
     * 保险服务
     */
    @JsonProperty("insure_services")
    private String insureServices;

    /**
     * 投保金额币别，采用国际ISO标准。如：USD(美元)。
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 投保金额，精确到2位小数。如：52344.12
     */
    @JsonProperty("insure_value")
    private String insureValue;

    /**
     * 备注。客户填写的入库委托备注信息。
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 出口报关类型; 可选值：D1(客户自行出口报关)； D2(一般贸易【出口退税】)； D5(非一般贸易报关【出口不退税】)； D6(特别监管区手册报关)
     */
    @JsonProperty("ocustoms_type")
    private String oCustomsType;

    /**
     * 进口报关类型; 可选值：D3(客户自有税号清关)； D4(非客户自有税号清关)
     */
    @JsonProperty("icustoms_type")
    private String iCustomsType;

    /**
     * 入库委托SKU集合信息
     */
    @JsonProperty("lstsku")
    private List<InboundConsignmentSku> lstsku;

    /**
     * 入库委托单创建时间。*注：时间格式：时间值需要转换为long类型格式。
     */
    @JsonProperty("create_time")
    private Long createTime;

    /**
     * 入库委托创建人
     */
    @JsonProperty("create_user")
    private String createUser;


}
