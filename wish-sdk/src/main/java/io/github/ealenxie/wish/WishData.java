package io.github.ealenxie.wish;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/11/21 15:52
 */
@Getter
@Setter
public class WishData<T> {


    /**
     * message
     */
    private String message;
    /**
     * code
     */
    private Integer code;

    private T data;
}
