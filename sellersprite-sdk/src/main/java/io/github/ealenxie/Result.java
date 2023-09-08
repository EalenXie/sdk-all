package io.github.ealenxie;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.ealenxie.serializer.SellerSpriteResponseDeserializer;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/1 10:47
 **/
@Getter
@Setter
public class Result<T> {

    private String code;

    private String message;

    @JsonDeserialize(using = SellerSpriteResponseDeserializer.class)
    private T data;
}

