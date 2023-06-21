package io.github.ealenxie.worldfirst.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/5 8:48
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequireArgs {
    private String clientId;
    private String privateKey;
}
