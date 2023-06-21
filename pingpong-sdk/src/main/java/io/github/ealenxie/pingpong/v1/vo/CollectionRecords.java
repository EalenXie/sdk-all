package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/30 16:51
 */
@Getter
@Setter
public class CollectionRecords {
    @JsonProperty("pg_no")
    private Integer pgNo;
    @JsonProperty("total_pg")
    private Integer totalPg;
    @JsonProperty("data")
    private List<CollectionRecord> data;
}
