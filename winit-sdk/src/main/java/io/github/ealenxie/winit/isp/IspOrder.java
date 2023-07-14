package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 17:14
 */
@Getter
@Setter
public class IspOrder {

    /**
     * refNo
     */
    @JsonProperty("refNo")
    private String refNo;
    /**
     * dispatchType
     */
    @JsonProperty("dispatchType")
    private String dispatchType;
    /**
     * expressNo
     */
    @JsonProperty("expressNo")
    private String expressNo;
    /**
     * buyerEmail
     */
    @JsonProperty("buyerEmail")
    private String buyerEmail;
    /**
     * winitProductName
     */
    @JsonProperty("winitProductName")
    private String winitProductName;
    /**
     * occurTime
     */
    @JsonProperty("occurTime")
    private String occurTime;
    /**
     * buyerAddress1
     */
    @JsonProperty("buyerAddress1")
    private String buyerAddress1;
    /**
     * buyerAddress2
     */
    @JsonProperty("buyerAddress2")
    private String buyerAddress2;
    /**
     * shipperCountry
     */
    @JsonProperty("shipperCountry")
    private String shipperCountry;
    /**
     * source
     */
    @JsonProperty("source")
    private String source;
    /**
     * shipperCity
     */
    @JsonProperty("shipperCity")
    private String shipperCity;
    /**
     * warehouseName
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * buyerZipCode
     */
    @JsonProperty("buyerZipCode")
    private String buyerZipCode;
    /**
     * shipperCountryCode
     */
    @JsonProperty("shipperCountryCode")
    private String shipperCountryCode;
    /**
     * buyerContactNo
     */
    @JsonProperty("buyerContactNo")
    private String buyerContactNo;
    /**
     * rmk
     */
    @JsonProperty("rmk")
    private String rmk;
    /**
     * iossNo
     */
    @JsonProperty("iossNo")
    private String iossNo;
    /**
     * buyerCompany
     */
    @JsonProperty("buyerCompany")
    private String buyerCompany;
    /**
     * buyerCity
     */
    @JsonProperty("buyerCity")
    private String buyerCity;
    /**
     * buyerHouseNo
     */
    @JsonProperty("buyerHouseNo")
    private String buyerHouseNo;
    /**
     * shipperEmail
     */
    @JsonProperty("shipperEmail")
    private String shipperEmail;
    /**
     * shipperState
     */
    @JsonProperty("shipperState")
    private String shipperState;
    /**
     * storeType
     */
    @JsonProperty("storeType")
    private String storeType;
    /**
     * orderNo
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * shipperAddress1
     */
    @JsonProperty("shipperAddress1")
    private String shipperAddress1;
    /**
     * isValid
     */
    @JsonProperty("isValid")
    private String isValid;
    /**
     * shipperAddress2
     */
    @JsonProperty("shipperAddress2")
    private String shipperAddress2;
    /**
     * buyerState
     */
    @JsonProperty("buyerState")
    private String buyerState;
    /**
     * buyerName
     */
    @JsonProperty("buyerName")
    private String buyerName;
    /**
     * packageList
     */
    @JsonProperty("packageList")
    private List<IspOrderPackage> packageList;
    /**
     * buyerCountry
     */
    @JsonProperty("buyerCountry")
    private String buyerCountry;
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * shipperAddrCode
     */
    @JsonProperty("shipperAddrCode")
    private String shipperAddrCode;
    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * shipperDistrict
     */
    @JsonProperty("shipperDistrict")
    private String shipperDistrict;
    /**
     * orderDate
     */
    @JsonProperty("orderDate")
    private String orderDate;
    /**
     * shipperPostCode
     */
    @JsonProperty("shipperPostCode")
    private String shipperPostCode;
    /**
     * ebaySellerId
     */
    @JsonProperty("ebaySellerId")
    private String ebaySellerId;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
