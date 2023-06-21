package io.github.ealenxie.kaufland.v1.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/12 14:59
 */
@Getter
@Setter
public class Claim {
    @JsonProperty("id_claim")
    private Long idClaim;
    @JsonProperty("id_order_unit")
    private Long idOrderUnit;
    @JsonProperty("id_buyer")
    private Long idBuyer;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("ts_created")
    private Date tsCreated;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("ts_updated")
    private Date tsUpdated;
    @JsonProperty("status")
    private String status;
    @JsonProperty("open_reason")
    private String openReason;
    @JsonProperty("callback_phone")
    private String callbackPhone;
    @JsonProperty("is_seller_responsible")
    private Boolean isSellerResponsible;
}
