package io.github.ealenxie.cne.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * CNE交运返回参数
 * zhn
 **/
@Getter
@Setter
public class ReturnParam {
    /**
     * 返回值
     */
    @JsonProperty("ReturnValue")
    private Integer returnValue;

    /**
     * 返回是否成功
     */
    @JsonProperty("OK")
    private Integer ok;

    /**
     * 请求错误信息
     */
    @JsonProperty("cMess")
    private String cMess;

    /**
     * 返回参数列表
     */
    @JsonProperty("ErrList")
    private List<ErrList> errList;

    public boolean isOk() {
        return ok > 0;
    }
}

