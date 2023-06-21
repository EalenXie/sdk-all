package io.github.ealenxie.shopify.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ShopifyTransactions {
    private List<ShopifyTransaction> transactions;
}
