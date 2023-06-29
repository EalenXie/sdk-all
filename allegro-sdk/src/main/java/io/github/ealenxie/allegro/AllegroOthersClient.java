package io.github.ealenxie.allegro;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.others.BillingEntriesResponse;
import io.github.ealenxie.allegro.others.BillingQueryParams;
import io.github.ealenxie.allegro.others.BillingTypePayload;
import io.github.ealenxie.allegro.others.BillingTypeQueryParams;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 12:36
 */
public class AllegroOthersClient extends AllegroClient {
    protected AllegroOthersClient(ObjectMapper mapper) {
        super(mapper);
    }

    protected AllegroOthersClient(RestOperations restOperations, ObjectMapper mapper) {
        super(restOperations, mapper);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBillingEntries">获取账单条目列表</a>
     */
    public BillingEntriesResponse billings(String accessToken, BillingQueryParams queryParams) {
        return getAllegro("/billing/billing-entries", accessToken, queryParams, BillingEntriesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBillingTypes">获取费用类型</a>
     */
    public List<BillingTypePayload> billingsType(String accessToken, BillingTypeQueryParams queryParams) {
        return getAllegro("/billing/billing-types", accessToken, queryParams, new ParameterizedTypeReference<List<BillingTypePayload>>() {
        });
    }
}
