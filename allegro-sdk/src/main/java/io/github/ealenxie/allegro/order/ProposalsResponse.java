package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/4/4 9:08
 */
@Getter
@Setter
public class ProposalsResponse {
    @JsonProperty("pickupDateProposals")
    private List<PickupDateProposal> pickupDateProposals;
}
