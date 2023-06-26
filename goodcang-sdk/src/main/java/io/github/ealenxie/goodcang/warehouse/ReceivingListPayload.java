
package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 9:53
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReceivingListPayload {

    /**
     * 入库单单号 列表
     */
    @JsonProperty("receiving_list")
    private List<String> receivingList;
}
