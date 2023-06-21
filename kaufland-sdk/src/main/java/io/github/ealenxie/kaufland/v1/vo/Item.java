package io.github.ealenxie.kaufland.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2022/08/12 15:01
 */
@Getter
@Setter
public class Item {
    @JsonProperty("id_item")
    private Long idItem;
    @JsonProperty("title")
    private String title;
    @JsonProperty("eans")
    private List<String> eans;
    @JsonProperty("id_category")
    private Long idCategory;
    @JsonProperty("main_picture")
    private String mainPicture;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("url")
    private String url;
    @JsonProperty("real_mgb_article_number")
    private String realMgbArticleNumber;
    @JsonProperty("age_rating")
    private Integer ageRating;
    @JsonProperty("is_valid")
    private Boolean isValid;
    @JsonProperty("dangerous_goods_li_shipping")
    private String dangerousGoodsLiShipping;
    @JsonProperty("danger_label_9A")
    private String dangerLabel9A;
}
