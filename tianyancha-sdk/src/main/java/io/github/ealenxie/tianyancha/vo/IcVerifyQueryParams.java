package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/8/1 12:47
 */
@Getter
@Setter
public class IcVerifyQueryParams {
    /**
     * 三码(注册号 /组织机构代码 /统一社会信用代码)
     */
    @JsonProperty("code")
    private String code;
    /**
     * 公司名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 法人
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;
}
