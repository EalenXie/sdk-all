package io.github.ealenxie.pingpong.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 11:26
 */
@Getter
@Setter
public class StoreInfoListDTO extends PingPongDTO {
    /**
     * 客户Id
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 必填 页码
     */
    @JsonProperty("pg_no")
    private Integer pgNo;

    public StoreInfoListDTO() {
    }


    public StoreInfoListDTO(String appId, String appSecret, String clientId, Integer pgNo) {
        super(appId, appSecret);
        this.clientId = clientId;
        this.pgNo = pgNo;
    }
}
