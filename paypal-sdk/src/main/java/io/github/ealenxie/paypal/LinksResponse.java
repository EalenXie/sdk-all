package io.github.ealenxie.paypal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/18 14:17
 */
@Getter
@Setter
public class LinksResponse {
    @JsonProperty("links")
    private List<Link> links;
}
