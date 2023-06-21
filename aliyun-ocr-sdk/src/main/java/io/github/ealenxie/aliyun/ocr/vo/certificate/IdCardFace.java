package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 16:10
 */
@Setter
@Getter
public class IdCardFace {
    /**
     * 住址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 民族
     */
    @JsonProperty("ethnicity")
    private String ethnicity;
    /**
     * 性别
     */
    @JsonProperty("sex")
    private String sex;
    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 身份证号码
     */
    @JsonProperty("idNumber")
    private String idNumber;
    /**
     * 出生日期
     */
    @JsonProperty("birthDate")
    private String birthDate;
    /**
     * isCopy
     */
    @JsonProperty("isCopy")
    private String isCopy;
}
