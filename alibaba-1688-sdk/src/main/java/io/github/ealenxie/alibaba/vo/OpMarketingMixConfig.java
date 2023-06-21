package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author zhs
 * @since 2022年12月16日 0016 10 29
 */
@Getter
@Setter
public class OpMarketingMixConfig {
    /**
     * 是否普通混批
     */
    @JsonProperty("generalHunpi")
    private boolean generalHunpi;
    /**
     * 创建时间
     */
    @JsonProperty("gmtCreate")
    private Date gmtCreate;
    /**
     * 修改时间
     */
    @JsonProperty("gmtModified")
    private Date gmtModified;
    /**
     * 卖家memberID
     */
    @JsonProperty("memberId")
    private String memberId;
    /**
     * 混批金额
     */
    @JsonProperty("mixAmount")
    private Integer mixAmount;
    /**
     * 混批数量
     */
    @JsonProperty("mixNumber")
    private Integer mixNumber;
}
