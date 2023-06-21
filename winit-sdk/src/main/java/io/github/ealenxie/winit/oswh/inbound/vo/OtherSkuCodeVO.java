package io.github.ealenxie.winit.oswh.inbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/3 14:02
 **/
@Getter
@Setter
public class OtherSkuCodeVO {

    /**
     * 第三方商品编码
     */
    @JsonProperty("thirdPartyCode")
    private String thirdPartyCode;
    /**
     * 说明
     */
    @JsonProperty("mark")
    private String mark;
}

