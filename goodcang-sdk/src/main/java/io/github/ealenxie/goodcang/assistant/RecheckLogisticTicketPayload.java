package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 11:09
 */
@Getter
@Setter
public class RecheckLogisticTicketPayload {
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
     * 附件ID数组
     */
    @JsonProperty("attachment_id_list")
    private List<Integer> attachmentIdList;
}
