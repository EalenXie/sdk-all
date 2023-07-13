package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class OrderPayment {
    @JsonProperty("carrier_subsidies")
    private List<CarrierSubsidies> carrierSubsidies;
    @JsonProperty("shipping_reimbursements")
    private List<ShippingReimbursements> shippingReimbursements;
    @JsonProperty("rev_share")
    private RevShare revShare;
    @JsonProperty("general_payment_details")
    private GeneralPaymentDetails generalPaymentDetails;
}
