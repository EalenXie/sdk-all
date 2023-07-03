package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class OffersQueryParams extends PageQueryParams {

    /**
     * category.id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("category.id")
    private String categoryId;

    /**
     * phrase
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("phrase")
    private String phrase;

    /**
     * seller.id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("seller.id")
    private String sellerId;

    /**
     * seller.login
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("seller.login")
    private String sellerLogin;

    /**
     * searchMode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("searchMode")
    private String searchMode;

    /**
     * sort
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sort")
    private String sort;

    /**
     * include
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("include")
    private String include;

    /**
     * fallback
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fallback")
    private Boolean fallback;

    /**
     * Dynamic filters
     * <p>
     * You can filter and customize your search results to find exactly what you need by applying filters ids and their dictionary values to query according to the flowing pattern: id=value.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("Dynamic filters")
    private Object filters;

}
