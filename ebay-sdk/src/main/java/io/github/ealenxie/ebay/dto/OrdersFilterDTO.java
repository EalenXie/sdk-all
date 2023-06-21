package io.github.ealenxie.ebay.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 16:25
 */
@Getter
@Setter
@SuppressWarnings("all")
public class OrdersFilterDTO implements EbayFilterDTO {


    /**
     * 格式为: [2016-02-21T08:25:43.511Z..2016-04-21T08:25:43.511Z]
     */
    private String creationdate;

    /**
     * 格式为:[2016-05-15T08:25:43.511Z..2016-05-31T08:25:43.511Z]
     */
    private String lastmodifieddate;


    private String orderfulfillmentstatus;

}
