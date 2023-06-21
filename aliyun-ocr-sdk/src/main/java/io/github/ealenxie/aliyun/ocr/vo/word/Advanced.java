package io.github.ealenxie.aliyun.ocr.vo.word;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.vo.Figure;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/11 13:42
 */
@Getter
@Setter
public class Advanced {

    /**
     * content
     */
    @JsonProperty("content")
    private String content;
    /**
     * height
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * width
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * orgHeight
     */
    @JsonProperty("orgHeight")
    private Integer orgHeight;
    /**
     * orgWidth
     */
    @JsonProperty("orgWidth")
    private Integer orgWidth;
    /**
     * prismVersion
     */
    @JsonProperty("prism_version")
    private String prismVersion;
    /**
     * prismWnum
     */
    @JsonProperty("prism_wnum")
    private Integer prismWnum;
    /**
     * 文字块信息
     */
    @JsonProperty("prism_wordsInfo")
    private List<PrismWordsInfo> prismWordsInfo;
    /**
     * 表格信息（当OutputTable=true时，返回此字段）。
     */
    @JsonProperty("prism_tablesInfo")
    private List<PrismTablesInfo> prismTablesInfo;
    /**
     * 段落信息（prism_paragraphsInfo字段。当Paragraph=true时，返回此字段。）
     */
    @JsonProperty("prism_paragraphsInfo")
    private List<ParagraphsInfo> prismParagraphsInfo;
    /**
     * 行信息（prism_rowsInfo字段。当Row=true时，返回此字段。）
     */
    @JsonProperty("prism_rowsInfo")
    private List<PrismRowsInfo> prismRowsInfo;

    /**
     * 是否需要图案检测功能，默认不需要。
     */
    private Figure figure;


}
