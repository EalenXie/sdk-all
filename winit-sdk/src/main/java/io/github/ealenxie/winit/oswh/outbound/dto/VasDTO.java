package io.github.ealenxie.winit.oswh.outbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/20 16:02
 * @version 1.0
 */
@Getter
@Setter
public class VasDTO {
    /**
     * 增值服务编码
     */
    @JsonProperty("serviceCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String serviceCode;
    /**
     * 增值明细信息
     */
    @JsonProperty("attrList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Attr> attrList;
}
