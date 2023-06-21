package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/6 16:29
 */
@Getter
@Setter
public class DrivingLicenseBack {

    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 档案编号
     */
    @JsonProperty("recordNumber")
    private String recordNumber;
    /**
     * 记录
     */
    @JsonProperty("record")
    private String records;
    /**
     * 证号
     */
    @JsonProperty("licenseNumber")
    private String licenseNumber;

}
