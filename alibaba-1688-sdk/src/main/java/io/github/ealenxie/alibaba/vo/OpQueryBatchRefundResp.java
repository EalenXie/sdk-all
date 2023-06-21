package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 13:35
 */
@Setter
@Getter
public class OpQueryBatchRefundResp {
    /**
     * 退款单信息
     */
    @JsonProperty("opOrderRefundModels")
    private List<OpOrderRefundModel> opOrderRefundModels;
}
