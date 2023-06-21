package io.github.ealenxie.aliyun.ocr.vo.certificate;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 14:34
 */
@Getter
@Setter
public class KoreaIdCard {

    /**
     * 本国姓名
     */
    private String name;
    /**
     * 中文姓名
     */
    private String nameChn;
    /**
     * 证件号码
     */
    private String cardNumber;
    /**
     * 住址
     */
    private String address;
    /**
     * 签发日期
     */
    private String issueDate;
    /**
     * 签发人
     */
    private String issuer;

}
