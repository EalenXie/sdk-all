package io.github.ealenxie.cne.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/16 11:06
 */
@Getter
@Setter
public class GetTrackNumberDTO extends CneCommon {

    @JsonProperty("cNo")
    private String cNo;

    public GetTrackNumberDTO(String icID, String clientSecret, String cNo) {
        super("GetTrackNumber", icID, clientSecret);
        this.cNo = cNo;
    }
}
