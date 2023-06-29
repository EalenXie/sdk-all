package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhs
 * @since 2022年12月27日 0027 17 20
 */
@Getter
@Setter
public class InboundCreate {

    /**
     * 客户操作账号。如果客户存在多个操作账号，客户必须指定一个操作账号传入。
     */
    @JsonProperty("customer_code")
    private String customerCode;

    /**
     * 1.创建入库委托单接口：入库业务类型:可选值 F(FB4), D(Dropshipping)，P（FBA Pro） 1.FB4备货客户可不传,系统默认F; 2.dropshpping客户必须传D;3.FBA Pro入库委托必须填P
     */
    @JsonProperty("business_type")
    private String businessType;

    /**
     * 客户参考号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * 是否上门提货；可选值：Y (上门提货) ；N （送货到仓）；C（工厂装柜）。  *注：如果是选择Y (上门提货)或者C（工厂装柜），supplier_address对象中参数：country，state或city（州和城市必须填写一个）,post_code，street，contack_name，phone，pickup_time 必须填写。 如果选择是N（送货到仓），supplier_address对象中参数：country， state或city（州和城市必须填写一个）, plan_arrive_time， from_warehouse_code必须填写。 如果国家是CN（中国），省、市、区必须填写。
     */
    @JsonProperty("is_pickup")
    private String isPickup;

    /**
     * 到货仓库代码（详细参考公共服务，获取仓库代码） *注：只有选择送货到仓服务才需要填写到货仓库。 如果到货仓库与上架仓库一致，则委托类型为客户自发，物流产品系统默认为客户自发服务。 如果到货仓库与上架仓库不一致，则委托单类型为4PX承运，需要客户选择物流产品。
     */
    @JsonProperty("from_warehouse_code")
    private String fromWarehouseCode;

    /**
     * 入库上架仓库代码（详细参考公共服务，获取仓库代码）
     */
    @JsonProperty("to_warehouse_code")
    private String toWarehouseCode;

    /**
     * 到仓运输类型。 如果委托类型是客户自发，则需要选择送到上架仓库的运输方式类型，可选值：A(空运);S(海运);E(快递);G(卡车)；R(火车）。 如果委托类型是4PX承运，则需要选择送货到4PX承运起始仓库的运输方式类型，可选值：E(快递);G(卡车)。
     */
    @JsonProperty("transport_type")
    private String transportType;

    /**
     * 到仓运输快递单号（如果委托类型是4PX承运，运输类型选择的是快递，则需要填写快递单号）
     */
    @JsonProperty("tracking_no")
    private String trackingNo;

    /**
     * 陆运卡车车牌号（如果委托类型是4PX承运，运输类型选择的是陆运，则需要填写陆运卡车车牌号）
     */
    @JsonProperty("license_plate")
    private String licensePlate;

    /**
     * 工厂仓库出货地址/供应商仓库发货地址或上门提货地址。请根据参数（is_pickup）选择是否上门提货类型选择进行填写。
     */
    @JsonProperty("supplier_address")
    private SupplierAddress supplierAddress;

    /**
     * 工厂装柜装柜模式 B(散装)，P（打板）
     */
    @JsonProperty("LoadingMode")
    private String loadingMode;

    /**
     * 柜型20GP,20HQ,40GP,40HQ,45HQ,FCL
     * 条件必填，由原来工厂装柜必须填写柜型，增加上门提货和送货到仓的选择整柜的物流产品则必须填写柜型，海运散货不用填写柜号
     */
    @JsonProperty("container_type")
    private String containerType;

    /**
     * 物流服务信息
     */
    @JsonProperty("logistics_service_info")
    private LogisticsServiceInfo logisticsServiceInfo;

    /**
     * 出口报关类型; 可选值：D1(客户自行出口报关)； D2(一般贸易【出口退税】)； D5(非一般贸易报关【出口不退税】)； D6(特别监管区手册报关)
     */
    @JsonProperty("ocustoms_service")
    private String oCustomsService;

    /**
     * 进口报关类型; 可选值：D3(客户自有税号清关)； D4(非客户自有税号清关)
     */
    @JsonProperty("icustoms_service")
    private String iCustomsService;

    /**
     * 税号（ 目的国为英国所有官发自发入库单必填，目的国为欧盟国家，官发入库单选择自有税号清关时必填，其他国家（美加日澳）非必填 ）
     */
    @JsonProperty("vat_no")
    private String vatNo;

    /**
     * 投保金额币别，采用国际ISO标准。可选值：USD(美元)。如：USD。
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 是否贴箱唛。可选值：Y (贴箱唛) ;N （不贴箱唛）; *注： 1.如果4PX承运，请选择Y(贴箱唛); 2.如果是自发头程客户分以下几种: a.FB4标准自发头程(QO9),请选择Y(贴箱唛); b.转运备货自发头程(F229),可选择N(不贴箱唛); c.海外本地备货客户(F045),可选择N(不贴箱唛); 3.dropshipping自发头程客户(F305),可选择N(不贴箱唛)
     */
    @JsonProperty("print_box_no")
    private String printBoxNo;

    /**
     * 箱唛类型,可选值:P(贴4px箱唛);Z(贴客户自定义箱唛); *注： 1.如果print_box_no选择Y(贴箱唛),print_box_type必须指定一种; 2.如果print_box_no选择N(不贴唛),print_box_type可为空; PS:只有部分头程产品客户可以指定不贴箱唛;
     */
    @JsonProperty("print_box_type")
    private String printBoxType;

    /**
     * 投保金额，精确到2位小数。如：52344.13。*注：如果选择保险服务后，insure_value（投保金额）必填。如果选择8Y(平邮保价)或5Y(挂号-快递保价)，投保金额必须在1.00到100.00之间。如果选择6P(0.6%保险），投保金额必须在200.00到9999999.00之间。
     */
    @JsonProperty("insure_value")
    private BigDecimal insureValue;

    /**
     * 备注。客户填写的入库委托备注信息。
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * SKU集合信息
     */
    @JsonProperty("iconsignment_sku")
    private List<IConsignmentSku> iConsignmentSkus;

}
