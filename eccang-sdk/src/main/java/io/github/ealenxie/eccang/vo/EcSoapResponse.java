package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/2 11:09
 */
@Setter
@Getter
public class EcSoapResponse {

    @JsonProperty("Body")
    private Body body;

}
