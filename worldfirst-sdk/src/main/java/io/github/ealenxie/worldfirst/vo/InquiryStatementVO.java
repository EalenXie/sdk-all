package io.github.ealenxie.worldfirst.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/5 14:25
 */
@Getter
@Setter
public class InquiryStatementVO {
    @JsonProperty("result")
    private Result result;
    /**
     * 由万里汇定义，用于唯一标识某次响应的ID。
     */
    @JsonProperty("responseId")
    private String responseId;
    /**
     * 对账单列表。
     */
    @JsonProperty("statementList")
    private List<StatementList> statementList;

    /**
     * 本次查询结果的总条目数。
     * 更多信息：最大长度：8
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 查询结果的总页数。
     * 更多信息:最大长度：8
     */
    @JsonProperty("totalPageNumber")
    private Integer totalPageNumber;
    /**
     * 当前页码。
     * 更多信息：最大长度：8
     */
    @JsonProperty("currentPageNumber")
    private Integer currentPageNumber;
}
