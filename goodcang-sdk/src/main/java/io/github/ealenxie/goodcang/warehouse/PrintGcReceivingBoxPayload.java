package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 10:34
 */
@Getter
@Setter
public class PrintGcReceivingBoxPayload {

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
    /**
     * 打印尺寸
     */
    @JsonProperty("print_size")
    private Integer printSize;
    /**
     * 打印类型
     */
    @JsonProperty("print_type")
    private Integer printType;
    /**
     * 入库单箱号
     */
    @JsonProperty("receiving_box_no_arr")
    private List<String> receivingBoxNoArr;
    /**
     * 打印方式
     */
    @JsonProperty("printing_method")
    private Integer printingMethod;
    /**
     * 是否打印"Made In China" 2 打印 4 不打印
     */
    @JsonProperty("made_in_china")
    private Integer madeInChina;
}
