package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 16:22
 */
@Getter
@Setter
public class SnListPayload {

    /**
     * 序列号
     */
    @JsonProperty("sn_list")
    private List<Sn> snList;
}
