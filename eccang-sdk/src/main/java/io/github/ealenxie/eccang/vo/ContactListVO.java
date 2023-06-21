package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/26 9:22
 */
@Getter
@Setter
public class ContactListVO {

    /**
     * 文档未写字段
     */
    @JsonProperty("supplierId")
    private String supplierId;

    /**
     * 文档未写字段
     */
    @JsonProperty("pmName")
    private String pmName;

    /**
     * 文档未写字段
     */
    @JsonProperty("addTime")
    private String addTime;
    /**
     * 联系人名称
     */
    @JsonProperty("contactName")
    private String contactName;

    /**
     * 联系人电话
     */
    @JsonProperty("contactTel")
    private String contactTel;

    /**
     * 联系人ID，主键ID
     */
    @JsonProperty("contactId")
    private Integer contactId;

    /**
     * Fax
     */
    @JsonProperty("contactFax")
    private String contactFax;

    /**
     * 中文联系地址
     */
    @JsonProperty("contactAddress")
    private String contactAddress;

    /**
     * 英文联系地址
     */
    @JsonProperty("contactAddressEn")
    private String contactAddressEn;

    /**
     * 联系邮编
     */
    @JsonProperty("contactPostCode")
    private String contactPostCode;

    /**
     * QQ
     */
    @JsonProperty("contactQQ")
    private String contactQQ;

    /**
     * 微信号
     */
    @JsonProperty("contactWechat")
    private String contactWechat;

    /**
     * 旺旺号
     */
    @JsonProperty("contactWangwang")
    private String contactWangwang;

    /**
     * Skype
     */
    @JsonProperty("contactSkype")
    private String contactSkype;

}
