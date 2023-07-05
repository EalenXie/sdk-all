package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import io.github.ealenxie.allegro.MethodPayload;
import io.github.ealenxie.allegro.order.Opening;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 10:32
 * @version 1.0
 */
@Getter
@Setter
public class PointPayload {

    /**
     * id
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    /**
     * externalId
     */
    @JsonProperty("externalId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String externalId;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * seller
     */
    @JsonProperty("seller")
    private IdPayload seller;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * address
     */
    @JsonProperty("address")
    private PointAddress address;
    /**
     * phoneNumber
     */
    @JsonProperty("phoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phoneNumber;
    /**
     * email
     */
    @JsonProperty("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;
    /**
     * locations
     */
    @JsonProperty("locations")
    private List<IdPayload> locations;
    /**
     * openHours
     */
    @JsonProperty("openHours")
    private List<Opening> openHours;
    /**
     * serviceTime
     */
    @JsonProperty("serviceTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String serviceTime;
    /**
     * payments
     */
    @JsonProperty("payments")
    private List<MethodPayload> payments;
    /**
     * confirmationType
     */
    @JsonProperty("confirmationType")
    private String confirmationType;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAt;
    /**
     * updatedAt
     */
    @JsonProperty("updatedAt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedAt;
}
