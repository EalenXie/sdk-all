package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 12:42
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BillingExportPayload {
    /**
     * 账单号列表
     */
    @JsonProperty("bill_number_list")
    private List<String> billNumberList;
}
