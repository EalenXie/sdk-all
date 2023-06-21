package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/23 13:22
 * @version 1.0
 */
@Getter
@Setter
public class InterceptOrderDTO {

    /**
     * 截单备注
     */
    @JsonProperty("interceptRemark")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String interceptRemark;
    /**
     * 调拨单code
     */
    @JsonProperty("tranferOrderCodes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> tranferOrderCodes;
}
