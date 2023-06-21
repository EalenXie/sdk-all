package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 13 51
 */
@Getter
@Setter
public class OrderRefundReason {
    /**
     * 原因id
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 原因
     */
    @JsonProperty("name")
    private String name;
    /**
     * 凭证是否必须上传
     */
    @JsonProperty("needVoucher")
    private Boolean needVoucher;
    /**
     * 是否支持退运费
     */
    @JsonProperty("noRefundCarriage")
    private Boolean noRefundCarriage;
    /**
     * 提示
     */
    @JsonProperty("tip")
    private String tip;
}
