package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.PagePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InventoryAgeListPayload extends PagePayload {


    @JsonProperty("product_sku_list")
    private List<String> productSkuList;
    @JsonProperty("product_title")
    private String productTitle;
    @JsonProperty("product_title_en")
    private String productTitleEn;
    @JsonProperty("warning_age_type")
    private String warningAgeType;
    @JsonProperty("age_from")
    private String ageFrom;
    @JsonProperty("age_to")
    private String ageTo;
    @JsonProperty("quantity_from")
    private String quantityFrom;
    @JsonProperty("quantity_to")
    private String quantityTo;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("fifo_time_from")
    private String fifoTimeFrom;
    @JsonProperty("fifo_time_to")
    private String fifoTimeTo;

}
