package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class ThreadsResponse extends Page {

    /**
     * threads
     */
    @JsonProperty("threads")
    private List<Thread> threads;
}
