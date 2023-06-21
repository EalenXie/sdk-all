package io.github.ealenxie.cne.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/16 11:06
 */
@Getter
@Setter
public class PreInputSetDTO extends CneCommon {

    @JsonProperty("RecList")
    private List<RecDTO> recList;

    public PreInputSetDTO(List<RecDTO> recList) {
        this.recList = recList;
    }

    public PreInputSetDTO(String icID, String clientSecret, List<RecDTO> recList) {
        super("PreInputSet", icID, clientSecret);
        this.recList = recList;
    }
}
