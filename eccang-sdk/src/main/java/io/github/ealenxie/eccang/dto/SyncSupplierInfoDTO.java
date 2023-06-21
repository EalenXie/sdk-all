package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/1/4 17:49
 */
@Getter
@Setter
public class SyncSupplierInfoDTO {
    /**
     * 采购单操作类型 ADD：创建；EDIT：编辑；默认 ADD
     */
    @JsonProperty("actionType")
    private String actionType;
    /**
     * 供应商数据对象
     */
    @JsonProperty("supplier")
    private YiBinSupplierDTO yiBinSupplierDTO;

    @JsonProperty("supplierCode")
    private String supplierCode;

    /**
     * 支付账户
     * 支付账户
     * Request.paymentAccountList
     * （默认支付方式为‘在线’时为必需，不需要更新可不传，更新方式为覆盖）
     * 可更新
     */
    @JsonProperty("paymentAccountList")
    private List<PaymentAccountListDTO> paymentAccountList;

    /**
     * 联系方式
     */
    @JsonProperty("contactList")
    private List<YiBinContactDTO> contactList;
    /**
     * 附属图片URL
     */
    @JsonProperty("supplierImagesList")
    private List<String> supplierImagesList;
}
