package io.github.ealenxie.alyunwms.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/11 10:15
 **/
@Getter
@Setter
public class ResponseBody {

    @JsonProperty("Body")
    private Body body;
}

