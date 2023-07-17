package io.github.ealenxie.winit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 13:21
 */
@Getter
@Setter
public class ListResponse<T> {


    @JsonProperty("list")
    private List<T> list;

}
