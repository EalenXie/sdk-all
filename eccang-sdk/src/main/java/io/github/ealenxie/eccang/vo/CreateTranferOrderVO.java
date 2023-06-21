package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月26日 0026 11 20
 */
@Getter
@Setter
public class CreateTranferOrderVO {

    @JsonProperty("tf_id")
    private String tfId;
}
