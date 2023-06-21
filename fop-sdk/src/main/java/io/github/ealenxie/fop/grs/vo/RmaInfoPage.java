package io.github.ealenxie.fop.grs.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/2 12:33
 */
@Getter
@Setter
public class RmaInfoPage {


    @JsonProperty("list")
    private List<ReceivedListInfo> list;
    @JsonProperty("pageNum")
    private Integer pageNum;
    @JsonProperty("pages")
    private Integer pages;
    @JsonProperty("total")
    private Integer total;
}
