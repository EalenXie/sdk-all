package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/20 14:14
 **/
@Getter
@Setter
public class EventNotificationsQueryParams {

    /**
     * The number of webhook event notifications to return in the response.
     */
    @JsonProperty("page_size")
    private Integer pageSize;
    /**
     * Filters the webhook event notifications in the response to those created on or after this date and time and on or before the end_time value.
     * Both values are in Internet date and time format format.
     * Example: start_time=2013-03-06T11:00:00Z.
     */
    @JsonProperty("start_time")
    private String startTime;
    /**
     * Filters the webhook event notifications in the response to those created on or after the start_time and on or before this date and time.
     * Both values are in Internet date and time format format.
     * Example: end_time=2013-03-06T11:00:00Z.
     */
    @JsonProperty("end_time")
    private String endTime;
    /**
     * Filters the response to a single transaction, by ID.
     */
    @JsonProperty("transaction_id")
    private Integer transactionId;
    /**
     * Filters the response to a single event.
     */
    @JsonProperty("event_type")
    private Integer eventType;
}

