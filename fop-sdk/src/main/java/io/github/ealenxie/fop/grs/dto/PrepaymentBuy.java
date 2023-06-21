package io.github.ealenxie.fop.grs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:19
 */
@Getter
@Setter
public class PrepaymentBuy {

    @JsonProperty("channelName")
    private String channelName;
    @JsonProperty("consigneeCity")
    private String consigneeCity;
    @JsonProperty("consigneeCityId")
    private String consigneeCityId;
    @JsonProperty("consigneeCompanyName")
    private String consigneeCompanyName;
    @JsonProperty("consigneeCountry")
    private String consigneeCountry;
    @JsonProperty("consigneeCountryCode")
    private String consigneeCountryCode;
    @JsonProperty("consigneeCountryId")
    private String consigneeCountryId;
    @JsonProperty("consigneeName")
    private String consigneeName;
    @JsonProperty("consigneePhone")
    private String consigneePhone;
    @JsonProperty("consigneePostCode")
    private String consigneePostCode;
    @JsonProperty("consigneeProvince")
    private String consigneeProvince;
    @JsonProperty("consigneeProvinceCode")
    private String consigneeProvinceCode;
    @JsonProperty("consigneeProvinceId")
    private String consigneeProvinceId;
    @JsonProperty("consigneeStreet")
    private String consigneeStreet;
    @JsonProperty("forecastHeight")
    private Integer forecastHeight;
    @JsonProperty("forecastLength")
    private Integer forecastLength;
    @JsonProperty("forecastWeight")
    private Integer forecastWeight;
    @JsonProperty("forecastWeightUnit")
    private String forecastWeightUnit;
    @JsonProperty("forecastWidth")
    private Integer forecastWidth;
    @JsonProperty("forecastparamUnit")
    private String forecastparamUnit;
    @JsonProperty("packageValue")
    private Integer packageValue;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("sendProductCode")
    private String sendProductCode;
    @JsonProperty("sendServiceCode")
    private String sendServiceCode;
    @JsonProperty("shipperCity")
    private String shipperCity;
    @JsonProperty("shipperCityCode")
    private String shipperCityCode;
    @JsonProperty("shipperCityId")
    private String shipperCityId;
    @JsonProperty("shipperCompanyName")
    private String shipperCompanyName;
    @JsonProperty("shipperCountry")
    private String shipperCountry;
    @JsonProperty("shipperCountryCode")
    private String shipperCountryCode;
    @JsonProperty("shipperCountryId")
    private String shipperCountryId;
    @JsonProperty("shipperName")
    private String shipperName;
    @JsonProperty("shipperPhone")
    private String shipperPhone;
    @JsonProperty("shipperPostCode")
    private String shipperPostCode;
    @JsonProperty("shipperProvince")
    private String shipperProvince;
    @JsonProperty("shipperProvinceCode")
    private String shipperProvinceCode;
    @JsonProperty("shipperProvinceId")
    private String shipperProvinceId;
    @JsonProperty("shipperStreet")
    private String shipperStreet;
    @JsonProperty("whCode")
    private String whCode;
}
