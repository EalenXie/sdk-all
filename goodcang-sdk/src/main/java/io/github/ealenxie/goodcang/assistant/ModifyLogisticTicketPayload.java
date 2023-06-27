package io.github.ealenxie.goodcang.assistant;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 10:06
 */
@Getter
@Setter
public class ModifyLogisticTicketPayload {
    /**
     * 查件单号
     */
    @JsonProperty("io_code")
    private String ioCode;
    /**
     * 查件需求
     */
    @JsonProperty("io_desc")
    private String ioDesc;
    /**
     * 通知邮箱
     */
    @JsonProperty("customer_emails_list")
    private List<String> customerEmailsList;
    /**
     * 保存类型
     */
    @JsonProperty("save_type")
    private Integer saveType;
    /**
     * 附件ID列表
     */
    @JsonProperty("attachment_id_list")
    private List<Integer> attachmentIdList;
}
