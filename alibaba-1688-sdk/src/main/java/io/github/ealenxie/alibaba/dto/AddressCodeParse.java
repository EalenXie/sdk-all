package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 10 38
 */
@Getter
@Setter
public class AddressCodeParse {
    /**
     * 地址信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String addressInfo;
}
