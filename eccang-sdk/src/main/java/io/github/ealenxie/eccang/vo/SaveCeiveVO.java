package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月26日 0026 10 54
 */
@Getter
@Setter
public class SaveCeiveVO {

    /**
     * 出库单号
     */
    @JsonProperty("ceiveCode")
    private String ceiveCode;

    /**
     * 出库单信息，具体见下表
     */
    @JsonProperty("ceiveInfo")
    private List<CeiveInfoVO> ceiveInfo;

}
