package io.github.ealenxie.cne.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/16 10:49
 */
@Getter
@Setter
public class EmsKindListVO {

    /**
     * 状态
     * 大于0：成功
     * 小于等于0：失败
     */
    @JsonProperty("ReturnValue")
    private Integer returnValue;
    /**
     * 错误描述
     */
    @JsonProperty("cMess")
    private String cMess;
    /**
     * 返回结果
     */
    @JsonProperty("List")
    private List<EmsKindVO> list;
}
