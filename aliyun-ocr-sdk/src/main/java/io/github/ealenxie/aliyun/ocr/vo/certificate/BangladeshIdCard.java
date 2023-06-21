package io.github.ealenxie.aliyun.ocr.vo.certificate;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 14:48
 */
@Getter
@Setter
public class BangladeshIdCard {

    /**
     * 本国姓名
     */
    private String name;
    /**
     * 英文姓名
     */
    private String nameEn;
    /**
     * 证件号码
     */
    private String cardNumber;
    /**
     * 出生日期
     */
    private String birthDate;
    /**
     * 父亲姓名
     */
    private String fatherName;
    /**
     * 母亲姓名
     */
    private String motherName;
}
