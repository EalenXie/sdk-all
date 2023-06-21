package io.github.ealenxie.shopify.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;
import org.springframework.web.util.UriComponentsBuilder;

@Getter
@Setter
public class GetPayoutsDTO {
    private String date;

    /**
     * 1是date当天数据,2是date_max当天之前的数据,3是date_min当天之后的数据
     */
    private int dateType;

    private Long id;
    /**
     * 1是last_id 指定id之前数据，2是since_id指定id之后的数据
     */
    private int idType;

    private String status;

    private int limit;

    public UriComponentsBuilder getBuilder(UriComponentsBuilder builder) {
        switch (dateType) {
            case 1:
                builder.queryParam("date", date);
                break;
            case 2:
                builder.queryParam("date_max", date);
                break;
            case 3:
                builder.queryParam("date_min", date);
                break;
            default:
                break;
        }
        if (idType == 1) {
            builder.queryParam("last_id", id);
        } else if (idType == 2) {
            builder.queryParam("since_id", id);
        }
        if (!ObjectUtils.isEmpty(status)) {
            builder.queryParam("status", status);
        }
        if (limit > 0) {
            builder.queryParam("limit", limit);
        }
        return builder;
    }


}
