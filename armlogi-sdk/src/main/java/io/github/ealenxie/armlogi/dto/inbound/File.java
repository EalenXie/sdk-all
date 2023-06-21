package io.github.ealenxie.armlogi.dto.inbound;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/3/30 13:45
 **/
@Getter
@Setter
public class File {
    /**
     * 文件名称
     */
    private String name;
    /**
     * 文件路径
     */
    private String path;
}

