package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/26 16:57
 */
@Getter
@Setter
public class CarInvoice {


    /**
     * 税控码。
     */
    @JsonProperty("taxCode")
    private String taxCode;
    /**
     * 税控码。
     */
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    /**
     * 发票代码。
     */
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    /**
     * 发票号
     */
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;
    /**
     * 机器编号
     */
    @JsonProperty("machineCode")
    private String machineCode;
    /**
     * 购买方名称
     */
    @JsonProperty("purchaserName")
    private String purchaserName;
    /**
     * 购买方身份证号码/组织机构代码
     */
    @JsonProperty("purchaseCode")
    private String purchaseCode;
    /**
     * 车辆类型
     */
    @JsonProperty("vehicleType")
    private String vehicleType;
    /**
     * 车辆类型
     */
    @JsonProperty("brandMode")
    private String brandMode;
    /**
     * 产地
     */
    @JsonProperty("origin")
    private String origin;
    /**
     * 合格证号
     */
    @JsonProperty("certificateNumber")
    private String certificateNumber;
    /**
     * 合格证号
     */
    @JsonProperty("importCertificateNumber")
    private String importCertificateNumber;
    /**
     * 商检单号
     */
    @JsonProperty("commodityInspectionNumber")
    private String commodityInspectionNumber;
    /**
     * 发动机号码
     */
    @JsonProperty("engineNumber")
    private String engineNumber;
    /**
     * 车辆识别代号/车架号码
     */
    @JsonProperty("vinCode")
    private String vinCode;
    /**
     * 价税合计（大写）
     */
    @JsonProperty("invoiceAmountCn")
    private String invoiceAmountCn;
    /**
     * 价税合计（小写）
     */
    @JsonProperty("invoiceAmount")
    private String invoiceAmount;
    /**
     * 销货单位名称
     */
    @JsonProperty("sellerName")
    private String sellerName;
    /**
     * 销货单位名称
     */
    @JsonProperty("sellerContact")
    private String sellerContact;
    /**
     * 销货单位纳税人识别号
     */
    @JsonProperty("sellerTaxNumber")
    private String sellerTaxNumber;
    /**
     * 销货单位账号
     */
    @JsonProperty("sellerBankAccount")
    private String sellerBankAccount;
    /**
     * 销货单位地址
     */
    @JsonProperty("sellerAddress")
    private String sellerAddress;
    /**
     * 销货单位开户银行
     */
    @JsonProperty("sellerDepositaryBank")
    private String sellerDepositaryBank;
    /**
     * 增值税税率或征收率
     */
    @JsonProperty("taxRate")
    private String taxRate;
    /**
     * 增值税税额
     */
    @JsonProperty("tax")
    private String tax;
    /**
     * 主管税务机关及代码
     */
    @JsonProperty("taxAuthoritiesInfo")
    private String taxAuthoritiesInfo;
    /**
     * 主管税务机关
     */
    @JsonProperty("taxAuthoritiesName")
    private String taxAuthoritiesName;
    /**
     * 主管税务机关
     */
    @JsonProperty("taxAuthoritiesCode")
    private String taxAuthoritiesCode;
    /**
     * 不含税价
     */
    @JsonProperty("preTaxAmount")
    private String preTaxAmount;
    /**
     * 限乘人数
     */
    @JsonProperty("passengerLimitNumber")
    private String passengerLimitNumber;
    /**
     * 开票人
     */
    @JsonProperty("issuer")
    private String issuer;
    /**
     * 吨位
     */
    @JsonProperty("tonnage")
    private String tonnage;
    /**
     * 购买方纳税人识别号
     */
    @JsonProperty("purchaserTaxNumber")
    private String purchaserTaxNumber;
    /**
     * 完税凭证号码
     */
    @JsonProperty("taxPaymentNumber")
    private String taxPaymentNumber;
}
