package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/4 14:39
 */
@Getter
@Setter
public class ParcelLabelQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String parcelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pageFormat;
}
