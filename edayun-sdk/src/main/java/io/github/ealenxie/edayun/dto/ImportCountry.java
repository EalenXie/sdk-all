package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImportCountry {


    /**
     * 进口国(国家缩写)
     */
    @JsonProperty("country")
    private String country;

    /**
     * 进口申报价格(USD)
     */
    @JsonProperty("importPrice")
    private String importPrice;


    /**
     * 服务类型(1自发头程,2 EDA头程)
     */
    @JsonProperty("firstripService")
    private String firstRipService;

    /**
     * 预留字段1
     */
    @JsonProperty("reserveField1")
    private String reserveField1;

    /**
     * 预留字段2
     */
    @JsonProperty("reserveField2")
    private String reserveField2;
}
