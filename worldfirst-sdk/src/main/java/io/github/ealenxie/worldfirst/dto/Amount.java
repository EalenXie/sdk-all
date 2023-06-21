package io.github.ealenxie.worldfirst.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/5 9:22
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Amount {
    /**
     * 币种，为符合ISO-4217规范的三字母货币代码
     * 字段最大长度：3
     */
    private String currency;
    /**
     * 数额，为基于当前货币最小单位的数额。例如：当currency 为 USD时，100 cents = $1.00。当currency 为 JPY时，100 = ¥100
     * 字段最大长度：16
     */
    private Integer value;
}
