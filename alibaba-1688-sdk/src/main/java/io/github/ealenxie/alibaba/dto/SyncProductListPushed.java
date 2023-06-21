package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 产品信息参数
 *
 * @author zhs
 * @since 2022-12-16
 */
@Setter
@Getter
public class SyncProductListPushed {

    /**
     * 1688的商品ID列表,列表长度不能超过20个
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("productIdList")
    private List<Long> productIdList;

}
