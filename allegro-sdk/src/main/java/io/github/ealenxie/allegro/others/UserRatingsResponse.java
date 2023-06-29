package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class UserRatingsResponse {


    /**
     * ratings
     */
    @JsonProperty("ratings")
    private List<UserRating> ratings;
}
