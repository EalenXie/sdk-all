package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/1 13:35
 */
@Getter
@Setter
public class HiMember {

    /**
     * 历史法人列表
     */
    @JsonProperty("pastLegalPersonList")
    private List<LegalPerson> pastLegalPersonList;

    /**
     * 历史董监高列表
     */
    @JsonProperty("pastStafferList")
    private List<List<PastStaffer>> pastStafferList;

    /**
     * 历史股东列表
     */
    @JsonProperty("pastholderList")
    private List<LegalPerson> pastholderList;
}
