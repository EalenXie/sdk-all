package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/5 15:13
 */
@Getter
@Setter
public class TransferPayer {
    /**
     * 由集成商定义的唯一付款人ID
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：64
     */
    private String referencePayerId;
    /**
     * 付款人姓名
     */
    private UserName payerName;
    /**
     * 代表付款人所在国家/地区的二字母ISO-3166 代码
     */
    private String payerCountry;
    /**
     * 付款人地址
     */
    private Address payerAddress;
    /**
     * 付款人的手机号码
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：24
     */
    private String payerMobileNo;
    /**
     * 付款人电子邮件地址
     */
    private String payerEmail;
    /**
     * 付款人注册时间
     * <p>
     * 更多信息：
     * <p>
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    private String payerRegistrationTime;
    /**
     * 付款人最后登录时间
     * <p>
     * 更多信息：
     * <p>
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    private String payerLastLoginTime;
    /**
     * 付款人更多信息
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：2048
     */
    private String extendInfo;
}
