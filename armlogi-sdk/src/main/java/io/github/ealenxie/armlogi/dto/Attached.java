package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/23 11:08
 * @version 1.0
 */
@Getter
@Setter
public class Attached {
    /**
     * 文件名称
     */
    @JsonProperty("fileName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fileName;
    /**
     * 文件说明
     */
    @JsonProperty("fileNote")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fileNote;
    /**
     * 文件类型：png,PDF，rar等
     */
    @JsonProperty("fileType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fileType;
    /**
     * 文件路径 文件原路径
     */
    @JsonProperty("fileUrl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fileUrl;
    /**
     * 标签路径 文件处理后URL 调用上传接口获取到处理后的路径
     */
    @JsonProperty("lableUrl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lableUrl;
    /**
     * 附件类型 1:订单附件 2:产品条码(图片)，3:Label
     */
    @JsonProperty("oatType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer oatType;
}
