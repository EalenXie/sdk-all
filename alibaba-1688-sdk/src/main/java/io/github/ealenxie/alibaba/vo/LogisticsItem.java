package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author jadechiang
 * @since 2022/12/15 14:03
 */
@Setter
@Getter
public class LogisticsItem {
    /**
     * 发货时间
     */
    private String deliveredTime;
    /**
     * 物流编号
     */
    private String logisticsCode;
    /**
     * SELF_SEND_GOODS("0")自行发货，在线发货ONLINE_SEND_GOODS("1"，不需要物流的发货 NO_LOGISTICS_SEND_GOODS("2")
     */
    private String type;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 状态
     */
    private String status;
    /**
     * 修改时间
     */
    private String gmtModified;
    /**
     * 创建时间
     */
    private String gmtCreate;
    /**
     * 运费(单位为元)
     */
    private BigDecimal carriage;
    /**
     * 发货省
     */
    private String fromProvince;
    /**
     * 发货市
     */
    private String fromCity;
    /**
     * 发货区
     */
    private String fromArea;
    /**
     * 发货街道地址
     */
    private String fromAddress;
    /**
     * 发货联系电话
     */
    private String fromPhone;
    /**
     * 发货联系手机
     */
    private String fromMobile;
    /**
     * 发货地址邮编
     */
    private String fromPost;
    /**
     * 物流公司Id
     */
    private Long logisticsCompanyId;
    /**
     * 物流公司编号
     */
    private String logisticsCompanyNo;
    /**
     * 物流公司名称
     */
    private String logisticsCompanyName;
    /**
     * 物流公司运单号
     */
    private String logisticsBillNo;
    /**
     * 商品明细条目id，如有多个以,分隔
     */
    private String subItemIds;
    /**
     * 收货省
     */
    private String toProvince;
    /**
     * 收货市
     */
    private String toCity;
    /**
     * 收货区
     */
    private String toArea;
    /**
     * 收货街道地址
     */
    private String toAddress;
    /**
     * 收货联系电话
     */
    private String toPhone;
    /**
     * 收货联系手机
     */
    private String toMobile;
    /**
     * 收货地址邮编
     */
    private String toPost;
    /**
     * 物流姓名
     */
    private String noLogisticsName;
    /**
     * 联系方式
     */
    private String noLogisticsTel;
    /**
     * 无需物流业务单号
     */
    private String noLogisticsBillNo;
    /**
     * 无需物流类别,noLogisticsCondition=1， 表示其他第三方物流、小型物充商、车队等, noLogisticsCondition=2 表示补运费、差价, noLogisticsCondition=3 表示卖家配送, noLogisticsCondition=4 表示买家自提 noLogisticsCondition=5 表示其他原因
     */
    private String noLogisticsCondition;
}
