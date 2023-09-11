package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/8/1 9:40
 */
@Getter
@Setter
public class KeywordPageQuery extends KeywordQueryParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("pageSize")
    private Integer pageSize;
    @JsonProperty("pageNum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageNum;

}
