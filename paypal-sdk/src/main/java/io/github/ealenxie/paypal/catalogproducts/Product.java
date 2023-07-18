package io.github.ealenxie.paypal.catalogproducts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/18 13:13
 */
@NoArgsConstructor
@Data
public class Product {
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
     * createTime
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
