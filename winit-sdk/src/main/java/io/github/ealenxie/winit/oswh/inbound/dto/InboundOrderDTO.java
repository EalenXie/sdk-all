package io.github.ealenxie.winit.oswh.inbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/2/2 13:48
 **/
@Getter
@Setter
public class InboundOrderDTO {
    /**
     * 订单类型编码 必填
     * SD 标准海外仓入库
     * DW 直发海外验入库
     * DI 直发国内验入库
     */
    @JsonProperty("orderType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderType;
    /**
     * Winit产品编码 必填
     * 取[查询头程服务]的Winit产品编码
     */
    @JsonProperty("winitProductCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String winitProductCode;
    /**
     * 目的仓编码 必填
     * 取[查询验货/目的仓]仓库编码
     */
    @JsonProperty("destinationWarehouseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String destinationWarehouseCode;
    /**
     * 客户订单号
     */
    @JsonProperty("sellerOrderNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sellerOrderNo;
    /**
     * 验货仓编码 必填
     * 取[查询验货/目的仓]仓库编码
     */
    @JsonProperty("inspectionWarehouseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String inspectionWarehouseCode;
    /**
     * 进口报关规则编码
     * 取[查询进口报关-IOR规则]的进口报关规则编码的EOR类型编码(CODE)
     * Winit承运时：必填
     * 卖家直发时：无需填，整个字段无需传入
     */
    @JsonProperty("importDeclarationRuleCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String importDeclarationRuleCode;
    /**
     * 出口报关类型编码
     * 取[查询出口报关-EOR类型]的EOR类型编码(CODE)
     * Winit承运时：必填
     * 卖家直发时：无需填，整个字段无需传入
     */
    @JsonProperty("exportDeclarationType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String exportDeclarationType;
    /**
     * 进口商编码
     * 通过查询进/出口商接口查询获得
     * 当importDeclarationRuleCode为：TIOR-第三方进口商的时候，无需填(整个字段无需传入)
     * 当importDeclarationRuleCode为：CIOR-自有进口商的时候，必填且只能填写非Winit的进口商
     * <p>
     * 注意：当目的国是英国或德国时，无论卖家直发还是WINIT承运，都必填
     */
    @JsonProperty("importerCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String importerCode;
    /**
     * 出口商编码
     * 通过查询进/出口商接口查询获得
     * 当exportDeclarationType为：TEOR-第三方出口商或者FEOR-金融出口商，无需填(整个字段无需传入)
     * 当exportDeclarationType为：CEOR-自有出口商,必填且只能填写非Winit的出口商
     */
    @JsonProperty("exporterCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String exporterCode;
    /**
     * 物流计划编码
     * 取[查询物流计划]的物流计划编码
     * 头程通过Winit承运的时候必填
     * 头程通过卖家自发的时候不需要填写，删除整个入参
     * WINIT产品名称中含有“WINIT头程”字
     */
    @JsonProperty("logisticsPlanNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String logisticsPlanNo;
    /**
     * 库存类型，
     * 2C:toC入库
     * 2B:ToB入库 非必填，卖家需要开启2B，2C库存管理才能使用，一般不入参
     * 测试sandbox环境默认入参2C
     */
    @JsonProperty("stockType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String stockType;
    /**
     * 提货/验货信息
     */
    @JsonProperty("dispatchInfo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DispatchInfoDTO dispatchInfo;
    /**
     * 箱单信息
     */
    @JsonProperty("packageList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<PackageListDTO> packageList;
    /**
     * 直发预报信息,以下为子节点,卖家直发必填否则可以直接不填写
     */
    @JsonProperty("directForecastInfo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DirectForecastInfoDTO directForecastInfo;
    /**
     * 送港信息,以下为子节点
     * 只有WINIT头程才需要WINIT产品才需要填写
     */
    @JsonProperty("sendPortInfo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SendPortInfoDTO sendPortInfo;
}

