package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileDTO {
    /**
     * 文件名
     */
    @JsonProperty("name")
    private String name;
}