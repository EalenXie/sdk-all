package io.github.ealenxie.aliyun.ocr.vo.certificate;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 15:07
 */
@Getter
@Setter
public class IndiaTaxIdCard {

    /**
     * 生日
     */
    private String birthDate;
    /**
     * 父亲姓名
     */
    private String fatherName;
    /**
     * 姓名
     */
    private String name;
    /**
     * 税号
     */
    private String taxId;


}
