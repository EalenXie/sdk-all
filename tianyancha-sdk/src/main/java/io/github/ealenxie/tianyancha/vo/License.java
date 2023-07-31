package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class License {
    /**
     * 表id
     */
    @JsonProperty("id")
    private Long tableId;

    /**
     * 许可书文编号
     */
    @JsonProperty("licencenumber")
    private String licenseNumber;

    /**
     * 许可证名称
     */
    @JsonProperty("licencename")
    private String licenseName;

    /**
     * 截止日期
     */
    @JsonProperty("todate")
    private String toDate;

    /**
     * 范围
     */
    @JsonProperty("scope")
    private String scope;

    /**
     * 来源
     */
    @JsonProperty("source")
    private String source;

    /**
     * 发证机关
     */
    @JsonProperty("department")
    private String department;

    /**
     * 起始日期
     */
    @JsonProperty("fromdate")
    private String fromDate;
}
