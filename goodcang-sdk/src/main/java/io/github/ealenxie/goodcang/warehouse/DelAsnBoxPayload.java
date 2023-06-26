package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 10:28
 */
@Getter
@Setter
public class DelAsnBoxPayload {


    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
    /**
     * 箱号数组
     */
    @JsonProperty("box_no")
    private List<String> boxNo;
}
