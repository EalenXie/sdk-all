package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/9 11:36
 * 物理仓对象数组
 */
@Getter
@Setter
public class Wp {
    /**
     * 物理仓名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 物理仓编码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 地址信息
     */
    @JsonProperty("address")
    private WpAddress address;
}
