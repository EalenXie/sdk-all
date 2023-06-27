package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 9:58
 */
@Getter
@Setter
public class LogisticTicket {
    /**
     * 查件号
     */
    @JsonProperty("io_code")
    private String ioCode;
    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
    /**
     * 跟踪号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;
    /**
     * 查件类型名
     */
    @JsonProperty("it_type_name")
    private String itTypeName;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;
    /**
     * 物流产品
     */
    @JsonProperty("sm_name")
    private String smName;
    /**
     * 创建时间
     */
    @JsonProperty("add_time")
    private String addTime;
    /**
     * 提交时间
     */
    @JsonProperty("commit_time")
    private String commitTime;
    /**
     * 处理时间
     */
    @JsonProperty("last_handle_time")
    private String lastHandleTime;
    /**
     * 回复时间
     */
    @JsonProperty("reply_time")
    private String replyTime;
    /**
     * 查件状态
     */
    @JsonProperty("io_status")
    private Integer ioStatus;
    /**
     * 查件状态文本
     */
    @JsonProperty("io_status_text")
    private String ioStatusText;
    /**
     * 物流状态
     */
    @JsonProperty("trail_status")
    private String trailStatus;
    /**
     * 物流状态文本
     */
    @JsonProperty("trail_status_text")
    private String trailStatusText;
    /**
     * 客服回复
     */
    @JsonProperty("customer_service_reply")
    private String customerServiceReply;
    /**
     * 回复附件列表
     */
    @JsonProperty("replay_attachment_file_list")
    private List<ReplayAttachmentFile> replayAttachmentFileList;
}
