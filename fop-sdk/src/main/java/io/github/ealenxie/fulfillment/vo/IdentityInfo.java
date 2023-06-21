package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * fop收件人证件信息
 */
@Getter
@Setter
public class IdentityInfo {

    /**
     * 收件人证件类型
     */
    @JsonProperty("id_type")
    private String idType;
    /**
     * 收件人证件号
     */
    @JsonProperty("id_card")
    private String idCard;
    /**
     * 收件人证件正面照
     */
    @JsonProperty("id_front_pic")
    private String idFrontPic;
    /**
     * 收件人证件背面照
     */
    @JsonProperty("id_back_pic")
    private String idBackPic;
}
