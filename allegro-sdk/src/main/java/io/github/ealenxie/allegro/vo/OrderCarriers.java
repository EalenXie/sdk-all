package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/18 14:43
 */
@Getter
@Setter
public class OrderCarriers {
    @JsonProperty("carriers")
    private List<Carrier> carriers;

}
