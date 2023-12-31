package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/16 10:11
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestNoPayload {
    /**
     * 请求单号，支持4PX单号、服务商单号、客户单号
     */
    @JsonProperty("request_no")
    private String requestNo;

}
