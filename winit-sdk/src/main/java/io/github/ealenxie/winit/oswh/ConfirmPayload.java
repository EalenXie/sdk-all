package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 16:59
 * @version 1.0
 */
@Getter
@Setter
public class ConfirmPayload {

    /**
     * orderNo
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * checkList
     */
    @JsonProperty("checkList")
    private List<CheckData> checkList;
}
