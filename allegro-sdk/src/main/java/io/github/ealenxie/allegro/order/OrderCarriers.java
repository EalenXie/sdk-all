package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdNamePayload;
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
    private List<IdNamePayload> carriers;

}
