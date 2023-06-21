package io.github.ealenxie.armlogi.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/4/7 11:12
 **/
@Getter
@Setter
public class PageDTO {
    /**
     * 当前页码,示例值(1)
     */
    private Integer pageIndex;
    /**
     * 每页条数，最大50,示例值(10)
     */
    private Integer pageSize;
}

