package io.github.ealenxie.aliyun.ocr.vo.certificate;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 15:12
 */
@Getter
@Setter
public class IndiaIdCardFace {

    /**
     * 本国姓名
     */
    private String name;
    /**
     * 英文姓名
     */
    private String nameEn;
    /**
     * 出生日期
     */
    private String birthDate;
    /**
     * 性别
     */
    private String sex;
    /**
     * 证件号码
     */
    private String cardNumber;
    /**
     * 虚拟号码
     */
    private String virtualNumber;

}
