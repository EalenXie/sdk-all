package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/11/2 10:52
 */
@Getter
@Setter
public class Condition {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("saleOrderCodes")
    private List<String> saleOrderCodes;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("refNos")
    private List<String> refNos;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platform;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdDateAfter;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updateDateAfter;


}
