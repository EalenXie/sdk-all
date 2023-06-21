package io.github.ealenxie.track.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 16:06
 */
@Getter
@Setter
public class CreateTrack {


    @JsonProperty("trk_createperson")
    private String trkCreateperson;
    @JsonProperty("tk_code")
    private String tkCode;
    @JsonProperty("trk_occurdate")
    private String trkOccurdate;
    @JsonProperty("trk_areadescription")
    private String trkAreadescription;
    @JsonProperty("trk_servicedescription")
    private String trkServicedescription;
    @JsonProperty("system")
    private String system;
    @JsonProperty("spTkcode")
    private String spTkcode;
    @JsonProperty("fpxTrackNo")
    private String fpxTrackNo;
    @JsonProperty("spTrackTimezone")
    private String spTrackTimezone;
    @JsonProperty("needToStandard")
    private Boolean needToStandard;
    @JsonProperty("serveHawbCode")
    private String serveHawbCode;
    @JsonProperty("trk_signatory")
    private String trkSignatory;
    @JsonProperty("ctm_id")
    private String ctmId;
    @JsonProperty("tbs_referenceno")
    private String tbsReferenceno;
    @JsonProperty("siteName")
    private String siteName;
    @JsonProperty("siteType")
    private String siteType;
    @JsonProperty("siteCode")
    private String siteCode;
    @JsonProperty("nextSiteName")
    private String nextSiteName;
    @JsonProperty("nextSiteType")
    private String nextSiteType;
    @JsonProperty("nextSiteCode")
    private String nextSiteCode;
    @JsonProperty("clearanceType")
    private String clearanceType;
    @JsonProperty("postManName")
    private String postManName;
    @JsonProperty("postManPhone")
    private String postManPhone;
    @JsonProperty("signName")
    private String signName;
    @JsonProperty("spTrackCity")
    private String spTrackCity;
    @JsonProperty("spTrackProvince")
    private String spTrackProvince;
    @JsonProperty("spTrackCountry")
    private String spTrackCountry;
}
