package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/20 16:02
 * @version 1.0
 */
@Getter
@Setter
public class Attr {
    /**
     * 可查询通过接口queryDeliveryWay查询出参中的attrCode
     */
    @JsonProperty("attrCode")
    private String attrCode;
    /**
     * 增值服务值
     */
    @JsonProperty("attrValue")
    private String attrValue;
}
