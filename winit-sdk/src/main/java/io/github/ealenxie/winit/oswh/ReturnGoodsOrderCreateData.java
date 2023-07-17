package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 10:19
 */
@Getter
@Setter
public class ReturnGoodsOrderCreateData {

    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * isWinitOutbound
     */
    @JsonProperty("isWinitOutbound")
    private String isWinitOutbound;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * customerOrderNo
     */
    @JsonProperty("customerOrderNo")
    private String customerOrderNo;
    /**
     * outboundOrderNo
     */
    @JsonProperty("outboundOrderNo")
    private String outboundOrderNo;
    /**
     * userInfoSource
     */
    @JsonProperty("userInfoSource")
    private String userInfoSource;
    /**
     * expressNo
     */
    @JsonProperty("expressNo")
    private String expressNo;
    /**
     * vATNo
     */
    @JsonProperty("VATNo")
    private String vATNo;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
    /**
     * phone
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * country
     */
    @JsonProperty("country")
    private String country;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * houseNo
     */
    @JsonProperty("houseNo")
    private String houseNo;
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * postcode
     */
    @JsonProperty("postcode")
    private String postcode;
    /**
     * address1
     */
    @JsonProperty("address1")
    private String address1;
    /**
     * address2
     */
    @JsonProperty("address2")
    private String address2;
    /**
     * packageLength
     */
    @JsonProperty("packageLength")
    private String packageLength;
    /**
     * packageWidth
     */
    @JsonProperty("packageWidth")
    private String packageWidth;
    /**
     * packageHeight
     */
    @JsonProperty("packageHeight")
    private String packageHeight;
    /**
     * packageWeight
     */
    @JsonProperty("packageWeight")
    private String packageWeight;
    /**
     * returnGoodsList
     */
    @JsonProperty("ReturnGoodsList")
    private List<ReturnGood> returnGoodsList;
}
