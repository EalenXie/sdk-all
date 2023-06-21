package io.github.ealenxie.manomano.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/29 17:02
 */
@Getter
@Setter
public class ManoManoDTO {
    /**
     * 登录id
     */
    private String login;
    /**
     * 密码
     */
    private String password;


    private String method;


    public ManoManoDTO(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public ManoManoDTO(String login, String password, String method) {
        this.login = login;
        this.password = password;
        this.method = method;
    }
}
