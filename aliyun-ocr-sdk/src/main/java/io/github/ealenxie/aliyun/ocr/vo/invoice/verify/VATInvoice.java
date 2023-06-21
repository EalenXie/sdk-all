package io.github.ealenxie.aliyun.ocr.vo.invoice.verify;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/7 17:27
 */
@Getter
@Setter
public class VATInvoice {
    /**
     * 完税凭证号码（机动车发票返回该信息）
     */
    @JsonProperty("afterTaxCode")
    private String afterTaxCode;
    /**
     * 发票税额
     */
    @JsonProperty("allTax")
    private String allTax;
    /**
     * 价税合计
     */
    @JsonProperty("allValoremTax")
    private String allValoremTax;
    /**
     * 蓝票发票代码
     */
    @JsonProperty("blueInvoiceCode")
    private String blueInvoiceCode;
    /**
     * 蓝票发票号码
     */
    @JsonProperty("blueInvoiceNo")
    private String blueInvoiceNo;
    /**
     * 厂牌型号（机动车、二手车发票返回该信息）
     */
    @JsonProperty("brandVersion")
    private String brandVersion;
    /**
     * 经营、拍卖单位（二手车发票返回信息）
     */
    @JsonProperty("businessUnit")
    private String businessUnit;
    /**
     * 经营、拍卖单位纳税人识别号（二手车发票返回信息）
     */
    @JsonProperty("businessUnitTaxNo")
    private String businessUnitTaxNo;
    /**
     * 经营、拍卖单位地址（二手车发票返回信息）
     */
    @JsonProperty("busmessUnitAddress")
    private String busmessUnitAddress;
    /**
     * 开户银行及账号（二手车发票返回信息）
     */
    @JsonProperty("busmessUnitBankAndAccount")
    private String busmessUnitBankAndAccount;
    /**
     * 经营、拍卖单位电话（二手车发票返回信息）
     */
    @JsonProperty("busmessUnitPhone")
    private String busmessUnitPhone;
    /**
     * 车价合计（二手车发票返回信息）
     */
    @JsonProperty("carPrice")
    private String carPrice;
    /**
     * 车辆类型（机动车、二手车发票返回该信息）
     */
    @JsonProperty("carType")
    private String carType;
    /**
     * 车种车号（货物发票返回信息）
     */
    @JsonProperty("carTypeAndNumber")
    private String carTypeAndNumber;
    /**
     * 车辆识别代号/车架号码（机动车、二手车发票返回该信息）
     */
    @JsonProperty("carframeCode")
    private String carframeCode;
    /**
     * 承运人名称（货物发票返回信息）
     */
    @JsonProperty("carrierName")
    private String carrierName;
    /**
     * 承运人识别号（货物发票返回信息）
     */
    @JsonProperty("carrierTaxNo")
    private String carrierTaxNo;
    /**
     * 校验码
     */
    @JsonProperty("checkCode")
    private String checkCode;
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 发货人名称（货物发票返回信息）
     */
    @JsonProperty("consignorName")
    private String consignorName;
    /**
     * 发货人识别号（货物发票返回信息）
     */
    @JsonProperty("consignorTaxNo")
    private String consignorTaxNo;
    /**
     * 验真结果
     */
    @JsonProperty("cyjgxx")
    private String cyjgxx;
    /**
     * detailList
     */
    @JsonProperty("detailList")
    private List<VATInvoiceDetail> detailList;
    /**
     * 受票方名称（货物发票返回信息）
     */
    @JsonProperty("draweeName")
    private String draweeName;
    /**
     * 受票方识别号（货物发票返回信息）
     */
    @JsonProperty("draweeTaxNo")
    private String draweeTaxNo;
    /**
     * 发动机号（机动车发票返回该信息）
     */
    @JsonProperty("engineCode")
    private String engineCode;
    /**
     * 购方身份证号/组织机构代码（机动车、二手车发票返回该信息）
     */
    @JsonProperty("idCard")
    private String idCard;
    /**
     * 进口证明书号（机动车发票返回该信息）
     */
    @JsonProperty("importLicense")
    private String importLicense;
    /**
     * 查验次数
     */
    @JsonProperty("inspectionAmount")
    private String inspectionAmount;
    /**
     * 商检单号（机动车发票返回该信息）
     */
    @JsonProperty("inspectionNumber")
    private String inspectionNumber;
    /**
     * 作废标志，N:未作废，Y:已作废，H:冲红
     */
    @JsonProperty("invalidMark")
    private String invalidMark;
    /**
     * 发票代码
     */
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    /**
     * 开票日期，格式：yyyymmdd
     */
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    /**
     * 发票金额
     */
    @JsonProperty("invoiceMoney")
    private String invoiceMoney;
    /**
     * 发票号码
     */
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;
    /**
     * 发票种类
     */
    @JsonProperty("invoiceType")
    private String invoiceType;
    /**
     * 二手车市场（二手车发票返回信息）
     */
    @JsonProperty("lemonMarket")
    private String lemonMarket;
    /**
     * 二手车市场地址（二手车发票返回信息）
     */
    @JsonProperty("lemonMarketAddress")
    private String lemonMarketAddress;
    /**
     * 二手车市场开户银行及账号（二手车发票返回信息）
     */
    @JsonProperty("lemonMarketBankAndAccount")
    private String lemonMarketBankAndAccount;
    /**
     * 二手车市场电话（二手车发票返回信息）
     */
    @JsonProperty("lemonMarketPhone")
    private String lemonMarketPhone;
    /**
     * 二手车市场纳税人识别号（二手车发票返回信息）
     */
    @JsonProperty("lemonMarketTaxNo")
    private String lemonMarketTaxNo;
    /**
     * 合格证号（机动车发票返回该信息）
     */
    @JsonProperty("licenseCode")
    private String licenseCode;
    /**
     * 车牌照号（二手车发票返回信息）
     */
    @JsonProperty("licensePlate")
    private String licensePlate;
    /**
     * 限乘人数（机动车发票返回该信息）
     */
    @JsonProperty("limitAmount")
    private String limitAmount;
    /**
     * 机器编号
     */
    @JsonProperty("machineCode")
    private String machineCode;
    /**
     * note
     */
    @JsonProperty("note")
    private String note;
    /**
     * 备注
     */
    @JsonProperty("producingArea")
    private String producingArea;
    /**
     * 购方地址、电话
     */
    @JsonProperty("purchaserAddressOrPhone")
    private String purchaserAddressOrPhone;
    /**
     * 购方开户行及账号
     */
    @JsonProperty("purchaserBankAndNumber")
    private String purchaserBankAndNumber;
    /**
     * 购方名称
     */
    @JsonProperty("purchaserName")
    private String purchaserName;
    /**
     * 买方电话（二手车发票返回信息）
     */
    @JsonProperty("purchaserPhone")
    private String purchaserPhone;
    /**
     * 购方税号
     */
    @JsonProperty("purchaserTaxpayerNumber")
    private String purchaserTaxpayerNumber;
    /**
     * 买方单位/个人（二手车发票返回信息）
     */
    @JsonProperty("purchaserUnitOrIndividual")
    private String purchaserUnitOrIndividual;
    /**
     * 买方单位/个人住址（二手车发票返回信息）
     */
    @JsonProperty("purchaserUnitOrIndividualAddress")
    private String purchaserUnitOrIndividualAddress;
    /**
     * 买方单位代码/身份证号（二手车发票返回信息）
     */
    @JsonProperty("purchaserUnitcodeOrIdNo")
    private String purchaserUnitcodeOrIdNo;
    /**
     * 收货人名称（货物发票返回信息）
     */
    @JsonProperty("receiveName")
    private String receiveName;
    /**
     * 收货人识别号（货物发票返回信息）
     */
    @JsonProperty("receiveTaxNo")
    private String receiveTaxNo;
    /**
     * 登记证号（二手车发票返回信息）
     */
    @JsonProperty("registrationNo")
    private String registrationNo;
    /**
     * 销方地址（机动车发票返回该信息）
     */
    @JsonProperty("salerAddress")
    private String salerAddress;
    /**
     * 销方地址、电话
     */
    @JsonProperty("salerAddressOrPhone")
    private String salerAddressOrPhone;
    /**
     * 销方开户账号（机动车发票返回该信息）
     */
    @JsonProperty("salerBankAccount")
    private String salerBankAccount;
    /**
     * 销方开户行及账号
     */
    @JsonProperty("salerBankAndNumber")
    private String salerBankAndNumber;
    /**
     * 销方开户银行（机动车发票返回该信息）
     */
    @JsonProperty("salerBankName")
    private String salerBankName;
    /**
     * 销方名称
     */
    @JsonProperty("salerName")
    private String salerName;
    /**
     * 销方电话（机动车发票返回该信息）
     */
    @JsonProperty("salerPhone")
    private String salerPhone;
    /**
     * 销方税号
     */
    @JsonProperty("salerTaxpayerNumber")
    private String salerTaxpayerNumber;
    /**
     * 卖方电话（二手车发票返回信息）
     */
    @JsonProperty("sellerPhone")
    private String sellerPhone;
    /**
     * 卖方单位代码/身份证号（二手车发票返回信息）
     */
    @JsonProperty("sellerUnitCodeOrIdno")
    private String sellerUnitCodeOrIdno;
    /**
     * 卖方单位/个人（二手车发票返回信息）
     */
    @JsonProperty("sellerUnitOrIndividual")
    private String sellerUnitOrIndividual;
    /**
     * 卖方单位/个人住址（二手车发票返回信息）
     */
    @JsonProperty("sellerUnitOrIndividualAddress")
    private String sellerUnitOrIndividualAddress;
    /**
     * 税控盘号（货物发票返回信息）
     */
    @JsonProperty("taxDiskNumber")
    private String taxDiskNumber;
    /**
     * 税率（机动车发票返回该信息）
     */
    @JsonProperty("taxRate")
    private String taxRate;
    /**
     * 主管税务机关代码（机动车发票返回该信息）
     */
    @JsonProperty("taxUnitCode")
    private String taxUnitCode;
    /**
     * 主管税务机关名称（机动车发票返回该信息）
     */
    @JsonProperty("taxUnitName")
    private String taxUnitName;
    /**
     * 起运地、经由、到达地（货物发票返回信息）
     */
    @JsonProperty("throughAddress")
    private String throughAddress;
    /**
     * 通行费标准（通行费发票返回信息）
     * Y：可抵扣通行费。N：不可抵扣通行费
     */
    @JsonProperty("trafficFeeFlag")
    private String trafficFeeFlag;
    /**
     * 转入地车辆车管所名称（二手车发票返回信息）
     */
    @JsonProperty("transferredVehicleOffice")
    private String transferredVehicleOffice;
    /**
     * 运输货物信息（货物发票返回信息）
     */
    @JsonProperty("transportGoodsInfo")
    private String transportGoodsInfo;
    /**
     * 吨位（机动车发票返回该信息）
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * 车船吨位（货物发票返回信息）
     */
    @JsonProperty("vehicleTonnage")
    private String vehicleTonnage;
    /**
     * 零税率标识
     * 通行费发票返回信息为空表示非零税率
     * 1：税率栏位显示“免税”
     * 2：税率栏位显示“不征税”
     * 3：零税率
     */
    @JsonProperty("zeroTaxRateFlag")
    private String zeroTaxRateFlag;
}
