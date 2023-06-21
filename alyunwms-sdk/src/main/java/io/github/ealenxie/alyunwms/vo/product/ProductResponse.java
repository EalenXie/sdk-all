package io.github.ealenxie.alyunwms.vo.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.alyunwms.vo.Error;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

/**
 * @author lanzhi
 * Created on 2023/2/11 15:25
 **/
@Getter
@Setter
public class ProductResponse {
    @JsonProperty("ask")
    private String ask;
    @JsonProperty("f_ask")
    private String fAsk;
    @JsonProperty("message")
    private String message;
    @JsonProperty("product_sku")
    private String productSku;
    @JsonProperty("Error")
    private Error error;

    public boolean isOk() {
        return ObjectUtils.nullSafeEquals("Success", ask);
    }
}

