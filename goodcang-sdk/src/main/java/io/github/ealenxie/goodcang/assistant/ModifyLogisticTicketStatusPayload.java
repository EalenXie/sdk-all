package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 11:00
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModifyLogisticTicketStatusPayload {


    /**
     * 查件单号列表
     */
    @JsonProperty("io_code_list")
    private List<String> ioCodeList;
    /**
     * 修改的状态
     */
    @JsonProperty("status")
    private Integer status;
}
