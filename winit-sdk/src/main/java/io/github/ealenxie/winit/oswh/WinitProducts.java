package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/3 10:47
 **/
@Getter
@Setter
public class WinitProducts {

    /**
     * Winit产品编码
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * Winit产品名称
     */
    @JsonProperty("description")
    private String description;
    /**
     * Winit产品描述
     */
    @JsonProperty("productName")
    private String productName;
}

