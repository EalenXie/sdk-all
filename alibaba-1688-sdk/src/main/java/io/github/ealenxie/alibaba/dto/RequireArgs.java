package io.github.ealenxie.alibaba.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/15 14:28
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequireArgs {
    private String appKey;
    private String appSecret;
    private String accessToken;
}
