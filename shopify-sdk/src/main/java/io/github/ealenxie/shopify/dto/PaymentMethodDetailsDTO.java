package io.github.ealenxie.shopify.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentMethodDetailsDTO {
    private CardDTO card;
    private String type;
}
