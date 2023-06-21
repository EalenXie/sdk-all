package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxCollection {
    /**
     * 税收征收模型
     */
    @JsonProperty("Model")
    private String model;
    /**
     * 代扣代缴税款的当事人
     * 枚举：Amazon Services, Inc.
     */
    @JsonProperty("ResponsibleParty")
    private String responsibleParty;
}