package io.github.ealenxie.lianlian.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import java.util.List;

/**
 * Created by EalenXie on 2022/6/7 13:24
 */
@Getter
@Setter
public class TransactionVO {

    @Nullable
    @JsonProperty("totalSize")
    private Integer totalSize;
    @JsonProperty("resultList")
    private List<Transaction> resultList;
}
