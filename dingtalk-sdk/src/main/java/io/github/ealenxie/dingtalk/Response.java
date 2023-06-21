package io.github.ealenxie.dingtalk;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/4 10:05
 **/
@Getter
@Setter
public class Response<T> {
    /**
     * 返回结果详情
     */
    private T result;

    /**
     * 调用是否成功。
     * true：成功
     * false：失败
     */
    private Boolean success;

}

