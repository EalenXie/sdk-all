package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class MessagesResponse extends PageQueryParams {

    /**
     * messages
     */
    @JsonProperty("messages")
    private List<NewMessageResponse> messages;
}
