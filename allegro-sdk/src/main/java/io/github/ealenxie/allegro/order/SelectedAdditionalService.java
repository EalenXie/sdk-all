package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.vo.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class SelectedAdditionalService {
    /**
     * 服务标识id
     */
    @JsonProperty("definitionId")
    private String definitionId;
    /**
     * 名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 价格
     */
    @JsonProperty("price")
    private Money price;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
