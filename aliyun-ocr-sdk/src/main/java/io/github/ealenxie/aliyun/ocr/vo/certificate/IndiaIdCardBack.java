package io.github.ealenxie.aliyun.ocr.vo.certificate;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 15:12
 */
@Getter
@Setter
public class IndiaIdCardBack {

    /**
     * 本国地址
     */
    private String address;
    /**
     * 英文地址
     */
    private String addressEn;
    /**
     * 证件号码
     */
    private String cardNumber;
    /**
     * 虚拟号码
     */
    private String virtualNumber;
}
