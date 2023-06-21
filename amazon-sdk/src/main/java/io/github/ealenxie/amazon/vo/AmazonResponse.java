package io.github.ealenxie.amazon.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/2/22 12:20
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AmazonResponse<T> {

    T payload;

    private List<AmazonError> errors;


}
