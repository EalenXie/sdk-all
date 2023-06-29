package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillingType {
    /**
     * 账单类型的三个字母代码
     */
    @JsonProperty("id")
    private String id;
    /**
     * 账单类型描述
     */
    @JsonProperty("name")
    private String name;
}
