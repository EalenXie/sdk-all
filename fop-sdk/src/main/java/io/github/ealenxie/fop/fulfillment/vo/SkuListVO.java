package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月27日 0027 10 14
 */
@Getter
@Setter
public class SkuListVO {

    /**
     * Sku数据集合
     */
    @JsonProperty("skulist")
    private List<Sku> skus;

}
