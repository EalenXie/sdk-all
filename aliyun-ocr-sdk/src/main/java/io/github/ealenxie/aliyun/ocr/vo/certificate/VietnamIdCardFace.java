package io.github.ealenxie.aliyun.ocr.vo.certificate;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 14:50
 */
@Getter
@Setter
public class VietnamIdCardFace {
    /**
     * 出生日期
     */
    private String birthDate;
    /**
     * 有效期至
     */
    private String validToDate;
    /**
     * 居住地
     */
    private String residence;
    /**
     * 证件类型
     */
    private String cardType;
    /**
     * 原籍地
     */
    private String placeOfAncestry;
    /**
     * 证件号码
     */
    private String cardNumber;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 国籍
     */
    private String nationality;
}
