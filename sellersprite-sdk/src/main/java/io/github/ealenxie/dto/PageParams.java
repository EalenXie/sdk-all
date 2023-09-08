package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author EalenXie created on 2023/7/24 10:48
 */
@Getter
@Setter
public class PageParams implements Serializable {

    private Integer page;

    private Integer size;


}
