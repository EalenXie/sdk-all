package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class BillingEntriesPayload {

    @JsonProperty("billingEntries")
    private List<BillingEntries> billingEntries;
}
