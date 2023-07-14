package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 17:06
 */
@Getter
@Setter
public class FilesResponse {

    /**
     * files
     */
    @JsonProperty("files")
    private List<String> files;
}
