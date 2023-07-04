package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 15:34
 * @version 1.0
 */
@Getter
@Setter
public class Quotes {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * fee
     */
    @JsonProperty("fee")
    private Money fee;
    /**
     * cycleDuration
     */
    @JsonProperty("cycleDuration")
    private String cycleDuration;
    /**
     * classifiedsPackage
     */
    @JsonProperty("classifiedsPackage")
    private IdPayload classifiedsPackage;
}
