package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/6 10:39
 */
@Getter
@Setter
public class TransferBeneficiary {
    /**
     * 由集成商定义的唯一收款人ID
     * 字段最大长度：64
     */
    private String referenceBeneficiaryId;
    /**
     * 收款人姓名
     */
    private UserName beneficiaryName;
    /**
     * 代表收款人所在国家/地区的二字母ISO-3166 代码
     *
     * <p>
     * 字段最大长度：3
     */
    private String beneficiaryCountry;
    /**
     * 收款人地址
     */
    private Address beneficiaryAddress;
    /**
     * 收款人联系电话
     *
     * <p>
     * 字段最大长度：24
     */
    private String beneficiaryMobileNo;
    /**
     * 收款人电子邮箱
     */
    private String beneficiaryEmail;
    /**
     * 收款人注册时间
     *
     * <p>
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    private String beneficiaryRegistrationTime;
    /**
     * 收款人最后登录时间
     *
     * <p>
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    private String beneficiaryLastLoginTime;
    /**
     * 收款人更多信息
     *
     * <p>
     * 字段最大长度：2048
     */
    private String extendInfo;
}
