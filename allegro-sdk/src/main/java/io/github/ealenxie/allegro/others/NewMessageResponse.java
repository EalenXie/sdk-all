package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class NewMessageResponse {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * thread
     */
    @JsonProperty("thread")
    private IdPayload thread;
    /**
     * author
     */
    @JsonProperty("author")
    private Author author;
    /**
     * text
     */
    @JsonProperty("text")
    private String text;
    /**
     * subject
     */
    @JsonProperty("subject")
    private String subject;
    /**
     * relatesTo
     */
    @JsonProperty("relatesTo")
    private RelatesTo relatesTo;
    /**
     * hasAdditionalAttachments
     */
    @JsonProperty("hasAdditionalAttachments")
    private Boolean hasAdditionalAttachments;
    /**
     * attachments
     */
    @JsonProperty("attachments")
    private List<Attachment> attachments;
    /**
     * additionalInformation
     */
    @JsonProperty("additionalInformation")
    private AdditionalInformation additionalInformation;
}
