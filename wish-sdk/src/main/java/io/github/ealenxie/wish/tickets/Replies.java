package io.github.ealenxie.wish.tickets;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 14:06
 * @version 1.0
 */
@Setter
@Getter
public class Replies {
    /**
     * message
     */
    @JsonProperty("message")
    private String message;
    /**
     * repliedAt
     */
    @JsonProperty("replied_at")
    private String repliedAt;
    /**
     * sender
     */
    @JsonProperty("sender")
    private String sender;
    /**
     * supportingFiles
     */
    @JsonProperty("supporting_files")
    private List<SupportingFile> supportingFiles;
}
