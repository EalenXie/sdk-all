package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 16:52
 * @version 1.0
 */
@Getter
@Setter
public class ImportPackPayload {

    /**
     * orderNo
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * packageList
     */
    @JsonProperty("packageList")
    private List<ImportPackage> packageList;
    /**
     * merchandiseSizeList
     */
    @JsonProperty("merchandiseSizeList")
    private List<MerchandiseSizeList> merchandiseSizeList;
}
