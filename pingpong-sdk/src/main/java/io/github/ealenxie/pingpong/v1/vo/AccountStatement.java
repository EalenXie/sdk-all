package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/30 14:53
 */
@Getter
@Setter
public class AccountStatement {

    /**
     * 流水信息
     */
    @JsonProperty("flowList")
    private List<Flow> flows;
}
