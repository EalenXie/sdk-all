package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月27日 0027 10 11
 */
@Getter
@Setter
public class SkuGetList {

    /**
     * SKU编号。*注：最大支持100个SKU查询
     */
    @JsonProperty("lstsku")
    private List<String> lstsku;

    /**
     * 客户操作帐号。如果客户存在操作账号，则可以指定客户操作账号进行查询，如果不传入，则查询返回所有操作账号下SKU信息。
     */
    @JsonProperty("customer_code")
    private String customerCode;

}
