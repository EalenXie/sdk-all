package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 13:59
 */
@Getter
@Setter
public class LogisticsCompany {
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("companyNo")
    private String companyNo;
    @JsonProperty("companyPhone")
    private String companyPhone;
    @JsonProperty("gmtCreate")
    private String gmtCreate;
    @JsonProperty("gmtModified")
    private String gmtModified;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("spelling")
    private String spelling;
    @JsonProperty("supportPrint")
    private Boolean supportPrint;
}
