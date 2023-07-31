package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Abnormal {
    /**
     * 移出时间
     */
    @JsonProperty("removeDate")
    private String removeDate;

    /**
     * 列入原因
     */
    @JsonProperty("putReason")
    private String putReason;

    /**
     * 决定列入机关
     */
    @JsonProperty("putDepartment")
    private String putDepartment;

    /**
     * 移出机关
     */
    @JsonProperty("removeDepartment")
    private String removeDepartment;

    /**
     * 移出原因
     */
    @JsonProperty("removeReason")
    private String removeReason;

    /**
     * 表id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 列入时间
     */
    @JsonProperty("putDate")
    private String putDate;
}