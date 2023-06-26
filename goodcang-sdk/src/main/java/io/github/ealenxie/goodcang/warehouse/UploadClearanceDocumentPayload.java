package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 13:13
 */
@NoArgsConstructor
@Data
public class UploadClearanceDocumentPayload {

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
    /**
     * 进/出口商编码
     */
    @JsonProperty("cv_id")
    private Integer cvId;
    /**
     * IEN号
     */
    @JsonProperty("ien_number")
    private String ienNumber;
    /**
     * 文件附件
     */
    @JsonProperty("upload_url")
    private List<UploadUrl> uploadUrl;
}
