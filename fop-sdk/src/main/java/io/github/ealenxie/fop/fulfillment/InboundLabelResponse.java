package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月27日 0027 10 04
 */
@Getter
@Setter
public class InboundLabelResponse {

    /**
     * 标签地址。返回标签文件格式为PDF文件。*注：入库委托单审核通过后，调用此方法会返回一个标签地址。系统处理生成标签需要5分钟左右，请在5分钟后通过返回地址下载PDF标签文件。
     */
    @JsonProperty("label_url")
    private String labelUrl;

    /**
     * 标签状态，可以根据状态查看标签生成情况。 如 :N (标签准备创建);U (标签创建中);Y (标签创建成功，可下载);
     */
    @JsonProperty("status")
    private String status;


}
