package io.github.ealenxie.dingtalk.oauth;

import lombok.Getter;
import lombok.Setter;

/**
 * 获取jsapiTicket
 *
 * @author lanzhi
 * Created on 2023/4/27 15:47
 **/
@Getter
@Setter
public class CreateJsapiTicketResponseBody {
    /**
     * 生成的accessToken。
     */
    private String jsapiTicket;
    /**
     * accessToken的过期时间，单位秒
     */
    private Long expireIn;
}

