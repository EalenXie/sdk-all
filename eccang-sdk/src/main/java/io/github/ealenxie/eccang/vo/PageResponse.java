package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/2 11:14
 */

@Getter
@Setter
public class PageResponse<T> extends Response<T> {

    @JsonProperty("totalCount")
    private String totalCount;
    @JsonProperty("page")
    private String page;
    @JsonProperty("pageSize")
    private String pageSize;
    @JsonProperty("nextPage")
    private boolean nextPage;

    @Override
    public boolean isOk() {
        return "200".equals(getCode());
    }
}
