package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/21 13:54
 * @version 1.0
 */
@Getter
@Setter
public class Deduction {
    @JsonProperty("id")
    private String id;
}
