package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 15:01
 */
@Setter
@Getter
public class SimpleAccountInfo {
    /**
     * 登录名
     */
    @JsonProperty("loginId")
    private String loginId;
    /**
     * 主营行业的类目名称
     */
    @JsonProperty("categoryName")
    private String categoryName;
    /**
     * 公司名
     */
    @JsonProperty("companyName")
    private String companyName;
    /**
     * 旺铺首页地址
     */
    @JsonProperty("shopUrl")
    private String shopUrl;
    /**
     * 供应商名称
     */
    @JsonProperty("supplierName")
    private String supplierName;
}
