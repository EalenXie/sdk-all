package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 11 28
 */
@Getter
@Setter
public class GetLogisticsInfos {

    /**
     * 订单号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orderId")
    private Long orderId;
    /**
     * 需要返回的字段，目前有:company.name,sender,receiver,sendgood。返回的字段要用英文逗号分隔开
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fields")
    private String fields;
    /**
     * 是1688业务还是icbu业务
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("webSite")
    private String webSite;

}
