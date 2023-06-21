package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageData<T> {


    @JsonProperty("total")
    private Integer total;
    @JsonProperty("rowsPerPage")
    private Integer rowsPerPage;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("datas")
    private List<T> datas;
}
