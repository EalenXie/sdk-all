package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/26 16:16
 **/
@Getter
@Setter
public class ApplicationContext {
    /**
     * This attribute controls the privacy of a payout transaction in recipient’s feed.
     * PUBLIC, FRIENDS_ONLY & PRIVATE are the values that can be used. PUBLIC - The payment displays on the recipient's public Venmo feed.
     * FRIENDS_ONLY - The payment displays only to the recipient's Venmo friends.
     * PRIVATE - The payment displays only on the recipient's personal feed. Defaults to PRIVATE if left blank.
     */
    @JsonProperty("social_feed_privacy")
    private String socialFeedPrivacy;
    /**
     * Link to a Holler sticker.
     * For Venmo recipients, the sticker displays with the payout message.
     * The maximum URL length is 151.
     */
    @JsonProperty("holler_url")
    private String hollerUrl;

    /**
     * Link to a logo that displays as the sender's profile image in the recipient's Venmo feed.
     * Used to add or update the business profile image.
     * Max image size: 1024 x 1024 pixels. The image should be square and maximum URL length is 2000.
     */
    @JsonProperty("logo_url")
    private String logoUrl;
}

