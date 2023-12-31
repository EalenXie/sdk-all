package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReadPayload {
    /**
     * read
     */
    @JsonProperty("read")
    private Boolean read;
}
