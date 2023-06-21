package io.github.ealenxie.cne.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * CNE交运返回错误信息
 **/
@Getter
@Setter
public class ErrList {
    /**
     * 索引位置
     */
    @JsonProperty("iIndex")
    private Integer iIndex;

    /**
     * 整数，说明此条记录被处理
     */
    @JsonProperty("iID")
    private Integer iID;

    /**
     * 运单号
     */
    @JsonProperty("cNo")
    private String cNo;

    /**
     * 为CNE公司内部使用
     */
    @JsonProperty("cNum")
    private String cNum;

    /**
     * 参考号
     */
    @JsonProperty("cRNo")
    private String cRNo;

    /**
     * 错误信息
     */
    @JsonProperty("cMess")
    private String cMess;

    /**
     * 打印链接
     */
    @JsonProperty("printUrl")
    private String printUrl;
}

