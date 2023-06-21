package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 注：上传订单附件，文件名需包含订单号或跟踪号，多个同名文件，后面追加-1，-2。需要将所有文件信息都上传，包括订单已经保存的文件信息
 *
 * @author create by sch  2023/4/23 13:13
 * @version 1.0
 */
@Getter
@Setter
public class UpdateAttachDTO {

    /**
     * 订单code
     */
    @JsonProperty("orderCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderCode;
    /**
     * attachList
     */
    @JsonProperty("attachList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Attached> attachList;
}
