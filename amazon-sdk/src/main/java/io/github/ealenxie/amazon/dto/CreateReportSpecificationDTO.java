package io.github.ealenxie.amazon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * Created by EalenXie on 2022/6/14 13:35
 */
@Getter
@Setter
public class CreateReportSpecificationDTO {
    /**
     * 必填 报告类型
     */
    @JsonProperty("reportType")
    private String reportType;
    /**
     * 必填 市场标识符Id列表
     */
    @JsonProperty("marketplaceIds")
    private List<String> marketplaceIds;
    /**
     * 报告附加参数
     */
    @JsonProperty("reportOptions")
    private Map<String, String> reportOptions;
    /**
     *
     */
    @JsonProperty("dataStartTime")
    private String dataStartTime;
    /**
     *
     */
    @JsonProperty("dataEndTime")
    private String dataEndTime;

}
