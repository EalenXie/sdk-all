package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 13 27
 */
@Getter
@Setter
public class AddSubAccount {

    /**
     * 子账号id列表
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("subUserIdentityList")
    private List<String> subUserIdentityList;

}
