package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author lanzhi
 * Created on 2023/9/4 15:24
 **/
@Getter
@Setter
public class Variation implements Serializable {
    /**
     * asin
     */
    private String asin;
    /**
     * attribute
     */
    private String attribute;

}

