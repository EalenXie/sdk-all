package io.github.ealenxie.aliyun.ocr.vo.word;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/11 14:10
 */
@Getter
@Setter
public class ParagraphsInfo {

    /**
     * 段落id，和prism_wordsInfo信息中的paragraphId对应。
     */
    private String paragraphId;
    /**
     * 段落文字。
     */
    private String word;


}
