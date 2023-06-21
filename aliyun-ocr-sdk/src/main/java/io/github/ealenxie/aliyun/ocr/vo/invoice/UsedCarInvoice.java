package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 13:11
 */
@Getter
@Setter
public class UsedCarInvoice {

    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;
    /**
     * 联次
     */
    @JsonProperty("formType")
    private String formType;
    /**
     * 开票日期
     */
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    /**
     * 发票代码
     */
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    /**
     * 发票号码
     */
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;
    /**
     * 机打代码
     */
    @JsonProperty("printedInvoiceCode")
    private String printedInvoiceCode;
    /**
     * 机打号码
     */
    @JsonProperty("printedInvoiceNumber")
    private String printedInvoiceNumber;
    /**
     * 税控码
     */
    @JsonProperty("taxCode")
    private String taxCode;
    /**
     * 买方单位/个人
     */
    @JsonProperty("purchaserName")
    private String purchaserName;
    /**
     * 买方单位代码/身份证号码
     */
    @JsonProperty("purchaserCode")
    private String purchaserCode;
    /**
     * 买方单位/个人地址
     */
    @JsonProperty("purchaserAddress")
    private String purchaserAddress;
    /**
     * 买方电话
     */
    @JsonProperty("purchaserPhoneNumber")
    private String purchaserPhoneNumber;
    /**
     * 卖方单位/个人
     */
    @JsonProperty("sellerName")
    private String sellerName;
    /**
     * 卖方单位代码/身份证号码
     */
    @JsonProperty("sellerCode")
    private String sellerCode;
    /**
     * 卖方单位/个人住址
     */
    @JsonProperty("sellerAddress")
    private String sellerAddress;
    /**
     * 卖方电话
     */
    @JsonProperty("sellerPhoneNumber")
    private String sellerPhoneNumber;
    /**
     * 车牌照号
     */
    @JsonProperty("licensePlateNumber")
    private String licensePlateNumber;
    /**
     * 登记证号
     */
    @JsonProperty("certificateNumber")
    private String certificateNumber;
    /**
     * 车辆类型
     */
    @JsonProperty("vehicleType")
    private String vehicleType;
    /**
     * 车架号/车辆识别代码
     */
    @JsonProperty("vinCode")
    private String vinCode;
    /**
     * 厂牌型号
     */
    @JsonProperty("brandMode")
    private String brandMode;
    /**
     * 转入地车辆管理所名称
     */
    @JsonProperty("vehicleAdministrationName")
    private String vehicleAdministrationName;
    /**
     * 车价合计(大写)
     */
    @JsonProperty("totalAmountInWords")
    private String totalAmountInWords;
    /**
     * 车价合计(小写)
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 二手车市场名称
     */
    @JsonProperty("marketName")
    private String marketName;
    /**
     * 二手车市场纳税人识别号
     */
    @JsonProperty("marketTaxNumber")
    private String marketTaxNumber;
    /**
     * 二手车市场地址
     */
    @JsonProperty("marketAddress")
    private String marketAddress;
    /**
     * 二手车市场开户银行及账户
     */
    @JsonProperty("marketBankAccountInfo")
    private String marketBankAccountInfo;
    /**
     * 二手车市场电话
     */
    @JsonProperty("marketPhoneNumber")
    private String marketPhoneNumber;
    /**
     * 备注
     */
    @JsonProperty("remarks")
    private String remarks;
    /**
     * 开票人
     */
    @JsonProperty("drawer")
    private String drawer;
}
