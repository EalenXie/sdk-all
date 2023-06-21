package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/12/12 16:38
 */
@Getter
@Setter
public class ProductPackage {

    @JsonProperty("packageCode")
    private String packageCode;
    @JsonProperty("packageName")
    private String packageName;
    @JsonProperty("packageQty")
    private Integer packageQty;
    @JsonProperty("packageWarehouse")
    private String packageWarehouse;


}
