package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/18 15:06
 */
@Getter
@Setter
public class JudicialDetailV4 {
    /**
     * 司法协助基本详情
     */
    @JsonProperty("assDetail")
    private AssDetail assDetail;

    /**
     * 股权冻结
     */
    @JsonProperty("frozen")
    private Frozen frozen;

    /**
     * 解除冻结
     */
    @JsonProperty("removeFrozen")
    private RemoveFrozen removeFrozen;

    /**
     * 司法协助续行
     */
    @JsonProperty("keepFrozen")
    private KeepFrozen keepFrozen;

    /**
     * 股权变更
     */
    @JsonProperty("shareholderChange")
    private ShareholderChange shareholderChange;

    /**
     * 司法冻结失效
     */
    @JsonProperty("invalidationFrozen")
    private InvalidationFrozen invalidationFrozen;

}
