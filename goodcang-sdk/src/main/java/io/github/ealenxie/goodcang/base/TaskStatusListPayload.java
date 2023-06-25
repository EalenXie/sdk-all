package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 12:58
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskStatusListPayload {

    /**
     * 请求id数组
     */
    @JsonProperty("request_id_list")
    private List<String> requestIdList;
}
