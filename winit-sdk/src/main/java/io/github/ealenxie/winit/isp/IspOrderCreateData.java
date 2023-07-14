package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 16:54
 */
@Getter
@Setter
public class IspOrderCreateData {


    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * dispatchType
     */
    @JsonProperty("dispatchType")
    private String dispatchType;
    /**
     * shipperAddrCode
     */
    @JsonProperty("shipperAddrCode")
    private String shipperAddrCode;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * refNo
     */
    @JsonProperty("refNo")
    private String refNo;
    /**
     * ebaySellerId
     */
    @JsonProperty("ebaySellerId")
    private String ebaySellerId;
    /**
     * isAllowRepeat
     */
    @JsonProperty("isAllowRepeat")
    private String isAllowRepeat;
    /**
     * vatNo
     */
    @JsonProperty("vatNo")
    private String vatNo;
    /**
     * iossNo
     */
    @JsonProperty("iossNo")
    private String iossNo;
    /**
     * eoriNo
     */
    @JsonProperty("eoriNo")
    private String eoriNo;
    /**
     * pickUpCode
     */
    @JsonProperty("pickUpCode")
    private String pickUpCode;
    /**
     * buyerCompany
     */
    @JsonProperty("buyerCompany")
    private String buyerCompany;
    /**
     * buyerCountry
     */
    @JsonProperty("buyerCountry")
    private String buyerCountry;
    /**
     * buyerState
     */
    @JsonProperty("buyerState")
    private String buyerState;
    /**
     * buyerCity
     */
    @JsonProperty("buyerCity")
    private String buyerCity;
    /**
     * buyerZipCode
     */
    @JsonProperty("buyerZipCode")
    private String buyerZipCode;
    /**
     * buyerEmail
     */
    @JsonProperty("buyerEmail")
    private String buyerEmail;
    /**
     * buyerName
     */
    @JsonProperty("buyerName")
    private String buyerName;
    /**
     * buyerContactNo
     */
    @JsonProperty("buyerContactNo")
    private String buyerContactNo;
    /**
     * buyerHouseNo
     */
    @JsonProperty("buyerHouseNo")
    private String buyerHouseNo;
    /**
     * recipientTaxID
     */
    @JsonProperty("recipientTaxID")
    private String recipientTaxID;
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
     * packageList
     */
    @JsonProperty("packageList")
    private List<IspOrderPackageData> packageList;
}
