package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2022/12/15 14:07
 */
@Setter
@Getter
public class Customs {
    /**
     * id
     */
    private String id;
    /**
     * 创建时间
     */
    private String gmtCreate;
    /**
     * 修改时间
     */
    private String gmtModified;
    /**
     * 买家id
     */
    private String buyerId;
    /**
     * 主订单id
     */
    private String orderId;
    /**
     * 业务数据类型,默认1：报关单
     */
    private String type;
    /**
     * 报关信息列表
     */
    private List<CustomsAttribute> attributes;
}
