package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月23日 0023 16 25
 */
@Getter
@Setter
public class VerifyPurchaseResponse<T> extends Response<T> {

    @JsonProperty("errorMessage")
    private T errorMessage;

}
