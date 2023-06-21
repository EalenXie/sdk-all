package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/18 15:20
 */
@Getter
@Setter
public class IdVO {

    @JsonProperty("id")
    private String id;
}
