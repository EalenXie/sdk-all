package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Offers {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * title
     */
    @JsonProperty("title")
    private String title;
    /**
     * snapshot
     */
    @JsonProperty("snapshot")
    private String snapshot;
}
