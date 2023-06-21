package io.github.ealenxie.lianlian.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/6/8 13:59
 */
@Getter
@Setter
public class AccountVO {

    @JsonProperty("totalSize")
    private Integer totalSize;
    @JsonProperty("resultList")
    private List<Account> resultList;
}
