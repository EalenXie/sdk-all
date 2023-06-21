package io.github.ealenxie.shopify.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;
import org.springframework.web.util.UriComponentsBuilder;

@Getter
@Setter
public class GetTransactionsDTO {

    private Long id;
    private Long payoutId;

    private String payoutStatus;

    private int limit;
    /**
     * 如果是拿id之前的数据， 那么就要从集合最后一条开始算，如果要拿之后的数据，那么就从集合第一条开始算 1是之前，2是之后
     */
    private int idType;

    public UriComponentsBuilder getBuilder(UriComponentsBuilder builder) {
        if (idType == 1) {
            builder.queryParam("last_id", id);
        } else if (idType == 2) {
            builder.queryParam("since_id", id);
        }
        if (!ObjectUtils.isEmpty(payoutStatus)) {
            builder.queryParam("payout_status", payoutStatus);
        }
        if (limit > 0) {
            builder.queryParam("limit", limit);
        }
        builder.queryParam("payout_id", payoutId);
        return builder;
    }

}
