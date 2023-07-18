package io.github.ealenxie.paypal.catalogproducts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/19 13:53
 */
@Getter
@Setter
public class ProductResponse {


    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * category
     */
    @JsonProperty("category")
    private String category;
    /**
     * imageUrl
     */
    @JsonProperty("image_url")
    private String imageUrl;
    /**
     * homeUrl
     */
    @JsonProperty("home_url")
    private String homeUrl;
    /**
     * createTime
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * updateTime
     */
    @JsonProperty("update_time")
    private String updateTime;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
