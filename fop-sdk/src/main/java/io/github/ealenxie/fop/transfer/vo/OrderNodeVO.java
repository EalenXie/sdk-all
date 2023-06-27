package io.github.ealenxie.fop.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:35
 */
@Getter
@Setter
public class OrderNodeVO {
    /**
     * 节点数据
     */
    @JsonProperty("contentData")
    private ContentData contentData;

    /**
     * 操作时间
     */
    @JsonProperty("createTime")
    private Long createTime;

    /**
     * 节点名称：
     * <p>
     * <p>
     * SIGNED：签收
     * <p>
     * INBOUNDED：入库完成
     * <p>
     * OUTBOUNDED：已出库
     * <p>
     * COMPLETED：用户已签收
     */
    @JsonProperty("nodeName")
    private String nodeName;
}
