package io.github.ealenxie.track.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 16:12
 */
@Getter
@Setter
public class CreateBusiness {


    @JsonProperty("beginTrack")
    private Boolean beginTrack;
    @JsonProperty("ct_code")
    private String ctCode;
    @JsonProperty("ct_code_start")
    private String ctCodeStart;
    @JsonProperty("ctm_id")
    private String ctmId;
    @JsonProperty("ref_code")
    private String refCode;
    @JsonProperty("sn_code")
    private String snCode;
    @JsonProperty("splitOrder")
    private String splitOrder;
    @JsonProperty("tbs_channelcode")
    private String tbsChannelcode;
    @JsonProperty("tbs_referenceno")
    private String tbsReferenceno;
    @JsonProperty("tbs_referenceshippercode")
    private String tbsReferenceshippercode;
    @JsonProperty("tbs_servecode")
    private String tbsServecode;
    @JsonProperty("tbs_shippercode")
    private String tbsShippercode;
}
