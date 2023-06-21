package io.github.ealenxie.aliyun.ocr.vo.word;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/11 14:20
 */
@Getter
@Setter
public class PrismRowsInfo {

    /**
     * 行id，和prism_wordsInfo信息中的rowId对应。
     */
    private String rowId;
    /**
     * 段落文字。
     */
    private String word;
}
