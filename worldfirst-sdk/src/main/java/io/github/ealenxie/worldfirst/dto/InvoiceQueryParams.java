package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/8/4 10:02
 **/
@Getter
@Setter
public class InvoiceQueryParams {

    /**
     * 由集成商定义的唯一请求 ID。
     * <p>
     * 字段最大长度：32
     */
    private String requestId;
}

