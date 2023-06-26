package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/10/21 11:15
 */
@Getter
@Setter
public class Carton {


    /**
     * 箱唛号
     */
    @JsonProperty("carton_no")
    private String cartonNo;

    /**
     * FBA箱唛号
     */
    @JsonProperty("fba_box_mark")
    private String fbaBoxMark;
}
