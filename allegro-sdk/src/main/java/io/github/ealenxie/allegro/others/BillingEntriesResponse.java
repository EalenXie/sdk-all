package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class BillingEntriesResponse {

    @JsonProperty("billingEntries")
    private List<BillingEntry> billingEntries;
}
