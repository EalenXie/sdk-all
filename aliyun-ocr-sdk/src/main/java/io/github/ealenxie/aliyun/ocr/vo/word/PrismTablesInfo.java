package io.github.ealenxie.aliyun.ocr.vo.word;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/11 13:44
 */
@Getter
@Setter
public class PrismTablesInfo {
    /**
     * 单元格信息
     */
    @JsonProperty("cellInfos")
    private List<CellInfo> cellInfos;
    /**
     * 表格id，和prism_wordsInfo信息中的tableId对应。
     */
    @JsonProperty("tableId")
    private Integer tableId;
    /**
     * 表格中横坐标单元格的数量
     */
    @JsonProperty("xCellSize")
    private Integer xCellSize;
    /**
     * 表格中纵坐标单元格的数量
     */
    @JsonProperty("yCellSize")
    private Integer yCellSize;
}
