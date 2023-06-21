package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/6 10:01
 */
@Setter
@Getter
public class Certification {
    /**
     * 面积
     */
    @JsonProperty("area")
    private String area;
    /**
     * 证号。
     */
    @JsonProperty("certificateNumber")
    private String certificateNumber;
    /**
     * 共有情况。
     */
    @JsonProperty("mutualOwnershipState")
    private String mutualOwnershipState;
    /**
     * 权利人。
     */
    @JsonProperty("obligee")
    private String oblige;
    /**
     * 坐落地址。
     */
    @JsonProperty("location")
    private String location;
    /**
     * 不动产单元号。
     */
    @JsonProperty("unitNumber")
    private String unitNumber;
    /**
     * 权利类型。
     */
    @JsonProperty("rightType")
    private String rightType;
    /**
     * 权利性质。
     */
    @JsonProperty("rightProperty")
    private String rightProperty;
    /**
     * 用途。
     */
    @JsonProperty("usage")
    private String usage;
    /**
     * 使用期限。
     */
    @JsonProperty("serviceLife")
    private String serviceLife;
    /**
     * 权利其他状况。
     */
    @JsonProperty("otherState")
    private String otherState;
    /**
     * 房屋建筑面积。
     */
    @JsonProperty("buildingArea")
    private String buildingArea;

}
