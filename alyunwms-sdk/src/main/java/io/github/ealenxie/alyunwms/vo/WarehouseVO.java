package io.github.ealenxie.alyunwms.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/17 15:09
 */
@Getter
@Setter
public class WarehouseVO {
    @JsonProperty("warehouse_id")
    private String warehouseId;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("warehouse_type")
    private String warehouseType;
    @JsonProperty("warehouse_status")
    private String warehouseStatus;
    @JsonProperty("country_id")
    private String countryId;
    @JsonProperty("state")
    private String state;
    @JsonProperty("city")
    private String city;
    @JsonProperty("contacter")
    private String contacter;
    @JsonProperty("company")
    private String company;
    @JsonProperty("phone_no")
    private String phoneNo;
    @JsonProperty("street_address1")
    private String streetAddress1;
    @JsonProperty("street_address2")
    private String streetAddress2;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("warehouse_desc")
    private String warehouseDesc;
    @JsonProperty("is_distribute_warehouse")
    private String isDistributeWarehouse;
    @JsonProperty("mail")
    private String mail;
    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("contact_person")
    private String contactPerson;
    @JsonProperty("telephone")
    private String telephone;
    @JsonProperty("area")
    private String area;
}
