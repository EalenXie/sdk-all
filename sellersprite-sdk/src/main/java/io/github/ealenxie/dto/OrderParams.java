package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author lanzhi
 * Created on 2023/8/31 17:33
 **/
@Getter
@Setter
public class OrderParams implements Serializable {
    /**
     * 排序字段
     */
    private String field;

    /**
     * true为降序 false为升序
     */
    private Boolean desc;
}

