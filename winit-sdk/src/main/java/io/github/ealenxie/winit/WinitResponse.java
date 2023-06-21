package io.github.ealenxie.winit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.ealenxie.winit.oswh.deser.WinitResponseDeserializer;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/1/20 12:53
 */
@Getter
@Setter
public class WinitResponse<T> {


    @JsonProperty("code")
    private String code;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("data")
    @JsonDeserialize(using = WinitResponseDeserializer.class)
    private T data;

}
