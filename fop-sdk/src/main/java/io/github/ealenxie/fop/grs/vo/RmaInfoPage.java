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

    /**
     * 收货信息
     */
    @JsonProperty("list")
    private List<ReceivedListInfo> list;

    /**
     * 分页面数量，默认值为100
     */
    @JsonProperty("pageNum")
    private Integer pageNum;

    /**
     * 分页开始页，默认值为0
     */
    @JsonProperty("pages")
    private Integer pages;

    /**
     * 总数
     */
    @JsonProperty("total")
    private Integer total;
}
