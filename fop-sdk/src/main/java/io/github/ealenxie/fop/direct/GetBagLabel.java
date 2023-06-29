package io.github.ealenxie.fop.direct;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 12:23
 */
@Getter
@Setter
public class GetBagLabel {
    /**
     * 随机值，无业务语义(必须保证每次请求都不一致，包括系统触发的重试请求，否则请求被拦截)
     */
    private String requestId;

    /**
     * 袋子号或单号
     */
    private String referenceCode;
}
