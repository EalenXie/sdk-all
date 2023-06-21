package io.github.ealenxie.eccang.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/1/4 17:58
 */
@Getter
@Setter
public class YiBinContactDTO {

    /**
     * 联系人名称
     */
    private String contactName;

    /**
     * 联系人电话
     */
    private String contactTel;

    /**
     * 联系人ID，主键ID
     */
    private Integer contactId;

    /**
     * Fax
     */
    private String contactFax;

    /**
     * 中文联系地址
     */
    private String contactAddress;

    /**
     * 英文联系地址
     */
    private String contactAddressEn;

    /**
     * 联系邮编
     */
    private String contactPostCode;

    /**
     * QQ
     */
    private String contactQQ;

    /**
     * 微信号
     */
    private String contactWechat;

    /**
     * 旺旺号
     */
    private String contactWangwang;

    /**
     * Skype
     */
    private String contactSkype;
}
