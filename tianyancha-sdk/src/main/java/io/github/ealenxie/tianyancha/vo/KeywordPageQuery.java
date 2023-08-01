package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/8/1 9:40
 */
@Getter
@Setter
public class KeywordPageQuery extends KeywordQueryParams {

    @JsonProperty("pageSize")
    private String pageSize;
    @JsonProperty("pageNum")
    private String pageNum;

}
