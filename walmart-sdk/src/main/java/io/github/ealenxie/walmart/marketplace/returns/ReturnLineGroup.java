package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/11 10:10
 * @version 1.0
 */
@Getter
@Setter
public class ReturnLineGroup {
    /**
     * groupNo
     */
    @JsonProperty("groupNo")
    private Integer groupNo;
    /**
     * returnLines
     */
    @JsonProperty("returnLines")
    private List<ReturnLine> returnLines;
    /**
     * labels
     */
    @JsonProperty("labels")
    private List<Label> labels;
    /**
     * returnExpectedFlag
     */
    @JsonProperty("returnExpectedFlag")
    private Boolean returnExpectedFlag;
}
