package io.github.ealenxie.cne.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/16 11:08
 */
@Getter
@Setter
public class RecDTO {

    /**
     * 快件类型，默认为1;取值为：0(文件),1(包裹),2(防水袋)
     */
    @JsonProperty("nItemType")
    private String nItemType;

    /**
     * 快递类别
     */
    @JsonProperty("cEmsKind")
    private String cEmsKind;

    /**
     * ISO 二字代码
     */
    @JsonProperty("cDes")
    private String cDes;

    /**
     * 重量，公斤，3 位小数
     */
    @JsonProperty("fWeight")
    private Double fWeight;

    /**
     * 长
     */
    @JsonProperty("iLong")
    private Integer iLong;

    /**
     * 宽
     */
    @JsonProperty("iWidth")
    private Integer iWidth;

    /**
     * 高
     */
    @JsonProperty("iHeight")
    private Integer iHeight;

    /**
     * 件数，默认1
     */
    @JsonProperty("iItem")
    private Integer iItem;

    /**
     * 付款方式，默认为1。取值为：0(月结),1(现付),2(到付)
     */
    @JsonProperty("nPayWay")
    private Integer nPayWay;

    /**
     * 收件人
     */
    @JsonProperty("cReceiver")
    private String cReceiver;

    /**
     * 收件单位
     */
    @JsonProperty("cRUnit")
    private String cRUnit;

    /**
     * 收件地址
     */
    @JsonProperty("cRAddr")
    private String cRAddr;

    /**
     * 收件城市
     */
    @JsonProperty("cRCity")
    private String cRCity;

    /**
     * 收件邮编
     */
    @JsonProperty("cRPostcode")
    private String cRPostcode;

    /**
     * 收件省州
     */
    @JsonProperty("cRProvince")
    private String cRProvince;

    /**
     * 收件国家【必须为英文】
     */
    @JsonProperty("cRCountry")
    private String cRCountry;

    /**
     * 收件电话
     */
    @JsonProperty("cRPhone")
    private String cRPhone;

    /**
     * 收件电邮
     */
    @JsonProperty("cREMail")
    private String cREMail;

    /**
     * 收件短信
     */
    @JsonProperty("cRSms")
    private String cRSms;

    /**
     * 订单对应平台
     */
    @JsonProperty("cAddrFrom")
    private String cAddrFrom;

    /**
     * 参考号
     */
    @JsonProperty("cRNo")
    private String cRNo;

    /**
     * 进口清关VAT税号-境外海关清关（更新）
     */
    @JsonProperty("cRTaxCode")
    private String cRTaxCode;

    /**
     * 出口清关税号-中国海关出口清关(暂时未使用)
     */
    @JsonProperty("cSTaxCode")
    private String cSTaxCode;

    /**
     * eori税号（新增）(暂时未使用)
     */
    @JsonProperty("eoriCode")
    private String eoriCode;

    /**
     * 英国VAT税号、欧盟国家使用的增值税号（新增）
     */
    @JsonProperty("vatCode")
    private String vatCode;

    /**
     * 欧盟ioss税号（新增）
     */
    @JsonProperty("iossCode")
    private String iossCode;

    /**
     * 发件人
     */
    @JsonProperty("cSender")
    private String cSender;

    /**
     * 发件单位
     */
    @JsonProperty("cSUnit")
    private String cSUnit;

    /**
     * 发件地址
     */
    @JsonProperty("cSAddr")
    private String cSAddr;

    /**
     * 快递类别
     */
    @JsonProperty("cSCity")
    private String cSCity;

    /**
     * 发件邮编
     */
    @JsonProperty("cSPostcode")
    private String cSPostcode;

    /**
     * 发件省州
     */
    @JsonProperty("cSProvince")
    private String cSProvince;

    /**
     * 发件国家
     */
    @JsonProperty("cSCountry")
    private String cSCountry;

    /**
     * 发件电话
     */
    @JsonProperty("cSPhone")
    private String cSPhone;

    /**
     * 发件电邮
     */
    @JsonProperty("cSEMail")
    private String cSEMail;

    /**
     * 发件短信
     */
    @JsonProperty("cSSms")
    private String cSSms;

    /**
     * 所属部门
     */
    @JsonProperty("cDepart")
    private String cDepart;

    /**
     * 标签
     */
    @JsonProperty("cMark")
    private String cMark;

    /**
     * 备注
     */
    @JsonProperty("cMemo")
    private String cMemo;

    /**
     * 接口提供商
     */
    @JsonProperty("cReserve")
    private String cReserve;

    /**
     * 托运备注
     */
    @JsonProperty("cTransNote")
    private String cTransNote;

    /**
     * 产品列表
     */
    @JsonProperty("GoodsList")
    private List<Goods> goodsList;

    /**
     * 退件地址
     */
    @JsonProperty("returnAddress")
    private ReturnAddress returnAddress;

    /**
     * 打印面单参数
     */
    @JsonProperty("labelContent")
    private LabelContent labelContent;
}
