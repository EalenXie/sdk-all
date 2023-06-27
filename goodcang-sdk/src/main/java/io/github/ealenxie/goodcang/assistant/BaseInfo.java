package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 10:22
 */
@Getter
@Setter
public class BaseInfo {
    /**
     * 查件号
     */
    @JsonProperty("io_code")
    private String ioCode;
    /**
     * 查件状态文本
     */
    @JsonProperty("io_status_text")
    private String ioStatusText;
    /**
     * 通知邮箱|客户邮箱
     */
    @JsonProperty("customer_emails")
    private String customerEmails;
    /**
     * 创建时间
     */
    @JsonProperty("add_time")
    private String addTime;
    /**
     * 查件需求|问题描述
     */
    @JsonProperty("io_desc")
    private String ioDesc;
    /**
     * 查件类型名称
     */
    @JsonProperty("it_type_name")
    private String itTypeName;
    /**
     * 提交时间
     */
    @JsonProperty("commit_time")
    private String commitTime;
    /**
     * 完结时间
     */
    @JsonProperty("finish_time")
    private String finishTime;
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
     * 提交附件
     */
    @JsonProperty("attachment_file_list")
    private List<AttachmentFile> attachmentFileList;
    /**
     * 处理回复信息
     */
    @JsonProperty("service_reply_list")
    private List<ServiceReplyList> serviceReplyList;
}
