package io.github.ealenxie.amazon.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/2/22 12:21
 */
@Getter
@Setter
public class AmazonError {
    private String code;
    private String message;
}
