package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.walmart.marketplace.feeds.*;
import org.springframework.web.client.RestOperations;

/**
 * @author create by sch  2023/7/6 13:57
 * @version 1.0
 */
public class WalmartFeedClient extends WalmartClient {
    public WalmartFeedClient(String clientId, String clientSecret) {
        super(clientId, clientSecret);
    }

    public WalmartFeedClient(String clientId, String clientSecret, ObjectMapper mapper) {
        super(clientId, clientSecret, mapper);
    }

    public WalmartFeedClient(String clientId, String clientSecret, ObjectMapper mapper, RestOperations restOperations) {
        super(clientId, clientSecret, mapper, restOperations);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/feeds">All feed statuses</a>
     */
    public FeedResponse getFeeds(String accessToken, FeedQueryParams queryParams) {
        return get("/v3/feeds", accessToken, queryParams, FeedResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/feeds#operation/getFeedItemStatus">Feed item status</a>
     */
    public FeedItemPayload getFeedItemStatus(String accessToken, String feedId, FeedItemQueryParams queryParams) {
        return get(String.format("/v3/feeds/%s", feedId), accessToken, queryParams, FeedItemPayload.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/feeds#operation/getFeedErrorReport">Get Feed Error Report</a>
     */
    public void getFeedErrorReport(String accessToken, String feedId, String feedType) {
        get(String.format("/v3/feeds/%s/errorReport", feedId), accessToken, new FeedType(feedType), Object.class);
    }

}
