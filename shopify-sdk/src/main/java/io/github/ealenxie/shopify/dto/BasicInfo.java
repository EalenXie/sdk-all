package io.github.ealenxie.shopify.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BasicInfo {

    private String apiKey;

    private String password;

    private String hostName;

    private String adminAccessToken;

    private String apiVersion;
}