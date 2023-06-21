package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 54
 */
@Getter
@Setter
public class ProductInfoResp {
    /**
     * 商品详情
     */
    @JsonProperty("productInfo")
    private ProductInfo productInfo;
    /**
     * 产品业务的支持信息,support为false说明不支持.
     */
    @JsonProperty("bizGroupInfos")
    private List<BizGroupInfo> bizGroupInfos;
    /**
     * 是否成功
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 调用信息
     */
    @JsonProperty("message")
    private String message;
}
