package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 13:53
 */
@Setter
@Getter
public class RefundOperation {

    @JsonProperty("afterOperateStatus")
    private String afterOperateStatus;
    @JsonProperty("beforeOperateStatus")
    private String beforeOperateStatus;
    @JsonProperty("closeRefundStepId")
    private Long closeRefundStepId;


    @JsonProperty("crmModifyRefund")
    private Boolean crmModifyRefund;


    @JsonProperty("discription")
    private String discription;
    @JsonProperty("email")
    private String email;


    @JsonProperty("freightBill")
    private String freightBill;
    @JsonProperty("gmtCreate")
    private String gmtCreate;
    @JsonProperty("gmtModified")
    private String gmtModified;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("messageStatus")
    private Integer messageStatus;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("msgType")
    private Integer msgType;

    @JsonProperty("operateRemark")
    private String operateRemark;

    @JsonProperty("operateTypeInt")
    private Integer operateTypeInt;

    @JsonProperty("operatorId")
    private String operatorId;

    @JsonProperty("operatorLoginId")
    private String operatorLoginId;

    @JsonProperty("operatorRoleId")
    private Integer operatorRoleId;

    @JsonProperty("operatorUserId")
    private Long operatorUserId;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("refundAddress")
    private String refundAddress;

    @JsonProperty("refundId")
    private String refundId;
    /**
     * 卖家拒绝退款原因
     */
    @JsonProperty("rejectReason")
    private String rejectReason;
    /**
     * 凭证图片地址
     */
    @JsonProperty("vouchers")
    private List<Object> vouchers;
    /**
     * 物流公司详情
     */
    @JsonProperty("logisticsCompany")
    private LogisticsCompany logisticsCompany;


}
