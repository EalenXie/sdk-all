package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 12:39
 */

@Getter
@Setter
public class OutboundCreate {
    /**
     * 业务类型(4PX内部调度所需，如需对接传值将说明，默认值：TRS。)
     */
    @JsonProperty("businessType")
    private String businessType;

    /**
     * 投递信息
     */
    @JsonProperty("deliverToRecipientInfo")
    private DeliverToRecipientInfo deliverToRecipientInfo;

    /**
     * 目的地区号
     */
    @JsonProperty("destinationAreaCode")
    private String destinationAreaCode;

    /**
     * 目的地国家地区二字码
     */
    @JsonProperty("destinationCountry")
    private String destinationCountry;

    /**
     * 税费费用承担方式(DDU,DDP)
     */
    @JsonProperty("dutyType")
    private String dutyType;

    /**
     * 需要合箱的入库委托fpxTrackingNo
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 需要合箱的入库委托fpxTrackingNo清单List
     */
    @JsonProperty("fpxTrackingNoList")
    private List<String> fpxTrackingNoList;

    /**
     * 是否投保(Y、N)
     */
    @JsonProperty("isInsure")
    private String isInsure;

    /**
     * 物流服务信息
     */
    @JsonProperty("logisticsServiceInfo")
    private LogisticsServiceInfo logisticsServiceInfo;

    /**
     * 成员代码
     */
    @JsonProperty("memberCode")
    private String memberCode;

    /**
     * 是否需要添加地址
     */
    @JsonProperty("needAddAddress")
    private Boolean needAddAddress;

    /**
     * 收件人信息
     */
    @JsonProperty("recipientInfo")
    private RecipientInfo recipientInfo;

    /**
     * 退件信息
     */
    @JsonProperty("returnInfo")
    private ReturnInfo returnInfo;

    /**
     * 销售平台表格
     */
    @JsonProperty("salesPlatform")
    private String salesPlatform;

    /**
     * 发件人信息
     */
    @JsonProperty("sender")
    private RecipientInfo sender;

    /**
     * 请求流水号唯一ID(方便跟踪请求日志)
     */
    @JsonProperty("serialNo")
    private String serialNo;

    /**
     * 交易号ID(数字或字母)
     * <p>
     * 例如电商平台交易单号
     */
    @JsonProperty("tradeId")
    private String tradeId;

    /**
     * 订单时间(Long型，时间戳)
     */
    @JsonProperty("tradeTime")
    private Long tradeTime;

    /**
     * 合并仓库代码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
}
