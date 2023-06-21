package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/8 11:22
 **/
@Getter
@Setter
public class GetProcessInstanceAttachments {
    /**
     * 附件名称
     */
    private String fileName;
    /**
     * 附件大小
     */
    private String fileSize;
    /**
     * 附件ID
     */
    private String fileId;
    /**
     * 附件类型
     */
    private String fileType;
}

