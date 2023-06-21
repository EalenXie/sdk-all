package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/26 15:15
 */
@Getter
@Setter
public class Fulfillment {

    /**
     * id
     **/
    @JsonProperty("id")
    private Long id;
    /**
     * 订单id
     **/
    @JsonProperty("order_id")
    private Long orderId;
    /**
     * 履行状态
     **/
    @JsonProperty("status")
    private String status;
    /**
     * 创建的日期和时间。 如果未关闭，则返回 null
     **/
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * 使用的服务类型
     **/
    @JsonProperty("service")
    private String service;
    /**
     * 修改的日期和时间。 如果未关闭，则返回 null。
     **/
    @JsonProperty("updated_at")
    private String updatedAt;
    /**
     * 运输公司的名称
     **/
    @JsonProperty("tracking_company")
    private String trackingCompany;
    /**
     * 履行的发货状态
     **/
    @JsonProperty("shipment_status")
    private String shipmentStatus;
    /**
     * 位置id
     **/
    @JsonProperty("location_id")
    private Long locationId;
    /**
     * 原始地址
     */
    @JsonProperty("origin_address")
    private OriginAddress originAddress;

    /**
     * 每个项目的历史记录
     **/
    @JsonProperty("line_items")
    private List<LineItem> lineItems;

    /**
     * 运输公司的编号
     **/
    @JsonProperty("tracking_number")
    private String trackingNumber;
    /**
     * 运输公司提供的运单号列表
     **/
    @JsonProperty("tracking_numbers")
    private List<String> trackingNumbers;
    /**
     * 履行的页面url
     **/
    @JsonProperty("tracking_url")
    private String trackingUrl;
    /**
     * url列表
     **/
    @JsonProperty("tracking_urls")
    private List<String> trackingUrls;
    /**
     * 收据信息
     **/
    @JsonProperty("receipt")
    private Receipt receipt;

    /**
     * 配送名称
     **/
    @JsonProperty("name")
    private String name;

    /**
     * 管理员ID
     **/
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;


}
