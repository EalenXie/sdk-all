package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class Company {
    /**
     * 公司名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 税号
     */
    @JsonProperty("taxId")
    private Object taxId;
}
