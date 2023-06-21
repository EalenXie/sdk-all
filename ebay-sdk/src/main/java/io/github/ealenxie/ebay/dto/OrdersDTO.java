package io.github.ealenxie.ebay.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/31 16:22
 */
@Getter
@Setter
public class OrdersDTO {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit = "20";
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offset;
    /**
     * 多个yi
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> orderIds;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> fieldGroups;
}
