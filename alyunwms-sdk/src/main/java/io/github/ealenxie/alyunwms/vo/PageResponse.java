package io.github.ealenxie.alyunwms.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

/**
 * @author lanzhi
 * Created on 2023/2/11 10:37
 **/
@Getter
@Setter
public class PageResponse<T> {

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
    @JsonProperty("data")
    private T data;
    @JsonProperty("Error")
    private Error error;

    public boolean isOk() {
        return ObjectUtils.nullSafeEquals("Success", ask);
    }
}

