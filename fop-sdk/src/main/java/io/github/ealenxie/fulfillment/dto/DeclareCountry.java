package io.github.ealenxie.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/14 13:39
 */
@Getter
@Setter
public class DeclareCountry {
    /**
     * 出口国。国家二字码，详细参考国际二字码。如：CN（中国）
     */
    @JsonProperty("export_country")
    private String exportCountry;
    /**
     * 商品出口口岸
     */
    @JsonProperty("export_port")
    private String exportPort;
    /**
     * 出口申报品名
     */
    @JsonProperty("export_declare")
    private String exportDeclare;
    /**
     * 客户出口海关编码
     */
    @JsonProperty("export_hscode")
    private String exportHsCode;
    /**
     * 出口申报价,精确到2位小数。如：12341.33
     */
    @JsonProperty("export_declare_value")
    private String exportDeclareValue;

    /**
     * 出口申报币别。采用国际ISO标准。可选值：USD(美元);CNY(人民币)。如：USD
     */
    @JsonProperty("export_currency")
    private String exportCurrency;

    /**
     * 进口国家。国家二字码，详细参考国际二字码。如：DE（德国）
     */
    private String country;
    /**
     * 进口口岸
     */
    @JsonProperty("import_port")
    private String importPort;
    /**
     * 进口申报品名
     */
    @JsonProperty("import_declare")
    private String importDeclare;
    /**
     * 客户进口海关编码
     */
    @JsonProperty("hs_code")
    private String hsCode;
    /**
     * 申报产品单价，精确到2位小数。如：12341.33
     */
    @JsonProperty("declare_value")
    private String declareValue;
    /**
     * 申报币别。采用国际ISO标准。可选值：USD(美元);CNY(人民币)。如：USD
     */
    private String currency;
    /**
     * 服务类型：不限：ALL或null，空运：AIR，海运整：SF，海运散货：SL，铁运整柜：RL，铁运散货：RF，陆运散货：GL，陆运整柜：GF，自有IOR：IOR（4PX返回审核结果）
     */
    @JsonProperty("service_type")
    private String serviceType;

    /**
     * 运输方式：可承运CR，有条件承运CC，限自发MC，限国际送仓IW，禁止FD，不通过NP（4PX返回审核结果）
     */
    @JsonProperty("transport_way")
    private String transportWay;

    /**
     * 国家状态：待审核：S，已审核：C，不通过：E
     */
    @JsonProperty("countryStatus")
    private String countryStatus;

    /**
     * 商品风控；等同于
     */
    @JsonProperty("risk")
    private String risk;

    /**
     * 证书信息清关资料URL集合。证书资料支持多个。
     */
    @JsonProperty("certificate_list")
    private List<Certificate> certificateList;

}
