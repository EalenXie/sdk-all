package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 10:04
 */
@Getter
@Setter
public class TasksResponse {


    /**
     * tasks
     */
    @JsonProperty("tasks")
    private List<Task> tasks;
}
