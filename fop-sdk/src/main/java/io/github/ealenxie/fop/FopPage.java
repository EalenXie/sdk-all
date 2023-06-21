package io.github.ealenxie.fop;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/10/8 16:11
 */
@Getter
@Setter
public class FopPage<T> {

    /**
     * 当前页面
     */
    @JsonProperty("page_no")
    private Integer pageNo;
    /**
     * 每页大小
     */
    @JsonProperty("page_size")
    private Integer pageSize;
    /**
     * 总页数
     */
    @JsonProperty("total")
    private Integer total;

    /**
     * 数据集
     */
    private T data;

}
