package io.github.ealenxie.aliyun.ocr.vo.certificate;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 14:50
 */
@Getter
@Setter
public class VietnamIdCardBack {
    /**
     * 签发人
     */
    private String issuer;
    /**
     * 机读码一
     */
    private String mrzLine1;
    /**
     * 机读码二
     */
    private String mrzLine2;
    /**
     * 机读码三
     */
    private String mrzLine3;
    /**
     * 身份识别特征
     */
    private String personalCharacteristics;
    /**
     * 签发日期
     */
    private String issueDate;

}
