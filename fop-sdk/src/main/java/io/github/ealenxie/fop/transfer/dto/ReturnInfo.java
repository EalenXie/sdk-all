package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class ReturnInfo {
    /**
     * 境内异常处理策略(退件：Y；销毁：N；其他：U；)
     * <p>
     * 默认值：N；
     */
    @JsonProperty("isReturnOnDomestic")
    private String isReturnOnDomestic;

    /**
     * 境内退件接收地址信息
     */
    @JsonProperty("domesticReturnAddr")
    private AddressInfo domesticReturnAddr;

    /**
     * 境外异常处理策略(退件：Y；销毁：N；其他：U；)
     * <p>
     * 默认值：N；
     */
    @JsonProperty("isReturnOnOversea")
    private String isReturnOnOversea;

    /**
     * 境外退件接收地址信息（处理策略为Y时必须填写地址信息）
     */
    @JsonProperty("overseaReturnAddr")
    private AddressInfo overseaReturnAddr;
}
