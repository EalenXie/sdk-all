package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/18 15:51
 */
@Getter
@Setter
public class Bankruptcy {

    /**
     * 总数
     */
    @JsonProperty("total")
    private Long total;

    /**
     * 公司id
     */
    @JsonProperty("gid")
    private Long gid;

    /**
     * 案件列表
     */
    @JsonProperty("items")
    private List<BankruptcyItem> items;

}
