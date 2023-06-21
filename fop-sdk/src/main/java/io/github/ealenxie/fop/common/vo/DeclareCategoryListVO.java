package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:58
 */
@Getter
@Setter
public class DeclareCategoryListVO {

    @JsonProperty("declarecategorylist")
    private List<DeclareCategory> declareCategoryList;
}
