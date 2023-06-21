package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2023年01月31日 0031 18 25
 */
@Getter
@Setter
public class GetSupplierImageListVO {

    @JsonProperty("url")
    private String url;

}
