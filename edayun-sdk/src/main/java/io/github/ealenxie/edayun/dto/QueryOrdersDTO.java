package io.github.ealenxie.edayun.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 批量查询订单条件
 */
@Getter
@Setter
public class QueryOrdersDTO {
    /**
     * 偏移量
     */
    private Integer offset;
    /**
     * 平台订单号集合
     */
    private List<String> channelOrderIdList;
    /**
     * EDA订单号集合
     */
    private List<String> businessNumList;
    /**
     * 修改时间开始,时间戳,比如：1658915227   查询条件：创建时间或修改时间必选其一
     */
    private Long modifyDateFrom;
    /**
     * 修改时间结束
     */
    private Long modifyDateTo;
    /**
     * 创建时间开始,时间戳,比如：1658915227
     */
    private Long createDateFrom;
    /**
     * 创建时间结束
     */
    private Long createDateTo;
}
