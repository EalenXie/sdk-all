package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 17:32
 */
@Getter
@Setter
public class TradeMarkCertification {
    /**
     * 有效期至
     */
    @JsonProperty("validToDate")
    private String validToDate;
    /**
     * 注册人地址
     */
    @JsonProperty("registeredAddress")
    private String registeredAddress;
    /**
     * 注册日期
     */
    @JsonProperty("registrationDate")
    private String registrationDate;
    /**
     * 注册人
     */
    @JsonProperty("registrant")
    private String registrant;
    /**
     * 核定使用商品/服务项目
     */
    @JsonProperty("approvedRightScope")
    private String approvedRightScope;
    /**
     * 知识产权编号
     */
    @JsonProperty("iprNumber")
    private String iprNumber;
    /**
     * 编码
     */
    @JsonProperty("certificateNumber")
    private String certificateNumber;
}
