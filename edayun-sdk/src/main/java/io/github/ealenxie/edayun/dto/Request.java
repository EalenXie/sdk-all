package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Request<T> {


    @JsonProperty("userName")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("data")
    private T data;

    public Request(String username, String password) {
        this(username, password, null);
    }

    public Request(String username, String password, T data) {
        this.username = username;
        this.password = password;
        this.data = data;
    }


}
