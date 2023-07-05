package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/5 13:15
 */
@Getter
@Setter
public class CompatibleProductsQueryParams extends PageQueryParams {
    @JsonProperty("type")
    private String type;
    @JsonProperty("group.id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String groupId;
    @JsonProperty("tecdoc.kTypNr")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String tecdocKTypNr;

    @JsonProperty("tecdoc.nTypNr")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String tecdocNTypNr;
    @JsonProperty("phrase")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String phrase;
}
