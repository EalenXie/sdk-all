package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 18:25
 */
@Getter
@Setter
public class PickupService {
    /**
     * id
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * userId
     */
    @JsonProperty("userId")
    private Integer userId;
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * address
     */
    @JsonProperty("address")
    private Object address;
    /**
     * isdefault
     */
    @JsonProperty("isdefault")
    private Object isdefault;
    /**
     * countryName
     */
    @JsonProperty("countryName")
    private String countryName;
    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * stateName
     */
    @JsonProperty("stateName")
    private String stateName;
    /**
     * cityName
     */
    @JsonProperty("cityName")
    private String cityName;
    /**
     * cityCode
     */
    @JsonProperty("cityCode")
    private String cityCode;
    /**
     * districtName
     */
    @JsonProperty("districtName")
    private String districtName;
    /**
     * districtCode
     */
    @JsonProperty("districtCode")
    private String districtCode;
    /**
     * detailCn
     */
    @JsonProperty("detailCn")
    private String detailCn;
    /**
     * detailEn
     */
    @JsonProperty("detailEn")
    private String detailEn;
    /**
     * postCode
     */
    @JsonProperty("postCode")
    private String postCode;
    /**
     * contactPerson
     */
    @JsonProperty("contactPerson")
    private String contactPerson;
    /**
     * contactNumber
     */
    @JsonProperty("contactNumber")
    private String contactNumber;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
    /**
     * city
     */
    @JsonProperty("city")
    private Object city;
    /**
     * doorplate
     */
    @JsonProperty("doorplate")
    private String doorplate;
    /**
     * detail1
     */
    @JsonProperty("detail1")
    private String detail1;
    /**
     * detail2
     */
    @JsonProperty("detail2")
    private String detail2;
    /**
     * charge
     */
    @JsonProperty("charge")
    private Object charge;
    /**
     * serviceCode
     */
    @JsonProperty("serviceCode")
    private Object serviceCode;
    /**
     * serviceName
     */
    @JsonProperty("serviceName")
    private Object serviceName;
    /**
     * vendorCode
     */
    @JsonProperty("vendorCode")
    private Object vendorCode;
    /**
     * addressServiceId
     */
    @JsonProperty("addressServiceId")
    private Integer addressServiceId;
    /**
     * vendorServiceCode
     */
    @JsonProperty("vendorServiceCode")
    private Object vendorServiceCode;
    /**
     * vendorServiceName
     */
    @JsonProperty("vendorServiceName")
    private Object vendorServiceName;
    /**
     * contactPersonEn
     */
    @JsonProperty("contactPersonEn")
    private String contactPersonEn;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * receiveWarehouseCode
     */
    @JsonProperty("receiveWarehouseCode")
    private Object receiveWarehouseCode;
    /**
     * receiveWarehouseName
     */
    @JsonProperty("receiveWarehouseName")
    private Object receiveWarehouseName;
    /**
     * winitProductLineName
     */
    @JsonProperty("winitProductLineName")
    private String winitProductLineName;
    /**
     * returnCode
     */
    @JsonProperty("returnCode")
    private Object returnCode;
    /**
     * created
     */
    @JsonProperty("created")
    private String created;
}
