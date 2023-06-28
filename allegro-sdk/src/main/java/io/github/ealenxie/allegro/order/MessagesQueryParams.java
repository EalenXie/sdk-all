package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/22 17:09
 */
@Getter
@Setter
public class MessagesQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offset = "0";

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit = "10";
}
