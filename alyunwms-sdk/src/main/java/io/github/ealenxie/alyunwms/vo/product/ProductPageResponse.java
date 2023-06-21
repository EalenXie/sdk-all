package io.github.ealenxie.alyunwms.vo.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.alyunwms.vo.Error;
import io.github.ealenxie.alyunwms.vo.Pagination;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

/**
 * @author lanzhi
 * Created on 2023/2/11 16:33
 **/
@Getter
@Setter
public class ProductPageResponse<T> {

    @JsonProperty("ask")
    private String ask;
    @JsonProperty("message")
    private String message;
    @JsonProperty("pagination")
    private Pagination pagination;
    @JsonProperty("nextPage")
    private Boolean nextPage;
    @JsonProperty("count")
    private String count;
    @JsonProperty("unit_weight")
    private String unitWeight;
    @JsonProperty("unit_size")
    private String unitSize;
    @JsonProperty("data")
    private T data;
    @JsonProperty("Error")
    private Error error;

    public boolean isOk() {
        return ObjectUtils.nullSafeEquals("Success", ask);
    }
}

