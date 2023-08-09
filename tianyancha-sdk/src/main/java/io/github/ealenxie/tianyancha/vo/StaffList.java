package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/8/9 13:50
 */
@Getter
@Setter
public class StaffList {
    /** 总数 */
    @JsonProperty("total")
    private Long total;

    /** 主要人员列表 */
    @JsonProperty("result")
    private List<StaffInfo> result;
}
