package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/4 11:25
 */
@Getter
@Setter
public class HotelConsume {


    /**
     * 传真
     */
    @JsonProperty("fax")
    private String fax;
    /**
     * 电话
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 邮编
     */
    @JsonProperty("postCode")
    private String postCode;
    /**
     * 房号
     */
    @JsonProperty("roomNo")
    private String roomNo;
    /**
     * 入住日期
     */
    @JsonProperty("checkInDate")
    private String checkInDate;
    /**
     * 离店日期
     */
    @JsonProperty("departureDate")
    private String departureDate;
    /**
     * 会员号码
     */
    @JsonProperty("memberNumber")
    private String memberNumber;
    /**
     * 消费总计
     */
    @JsonProperty("totalConsumption")
    private String totalConsumption;
    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 房型
     */
    @JsonProperty("roomType")
    private String roomType;
    /**
     * 住店人数
     */
    @JsonProperty("numberOfGuests")
    private String numberOfGuests;
    /**
     * 房费
     */
    @JsonProperty("roomRate")
    private String roomRate;
    /**
     * 地址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 消费详单
     */
    @JsonProperty("consumptionDetails")
    private List<ConsumptionDetails> consumptionDetails;
}
