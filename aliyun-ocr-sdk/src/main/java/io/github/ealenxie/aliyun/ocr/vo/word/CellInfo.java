package io.github.ealenxie.aliyun.ocr.vo.word;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.vo.Points;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/11 14:05
 */
@Getter
@Setter
public class CellInfo {

    /**
     * 单元格位置，按照单元格四个角的坐标顺时针排列，分别为左上XY坐标、右上XY坐标、右下XY坐标、左下XY坐标
     */
    @JsonProperty("pos")
    private List<Points> pos;
    /**
     * 表格中单元格id，和prism_wordsInfo信息中的tableCellId对应。
     */
    @JsonProperty("tableCellId")
    private Integer tableCellId;
    /**
     * 单元格中的文字
     */
    @JsonProperty("word")
    private String word;
    /**
     * xEndCell缩写，表示横轴方向该单元格结束在第几个单元格，第一个单元格值为0，如果xsc和xec都为0说明该文字在横轴方向占据了一个单元格并且在第一个单元格内。
     */
    @JsonProperty("xec")
    private Integer xec;
    /**
     * xStartCell缩写，表示横轴方向该单元格起始在第几个单元格，第一个单元格值为0
     */
    @JsonProperty("xsc")
    private Integer xsc;
    /**
     * yEndCell缩写，表示纵轴方向该单元格结束在第几个单元格，第一个单元格值为0
     */
    @JsonProperty("yec")
    private Integer yec;
    /**
     * yStartCell缩写，表示纵轴方向该单元格起始在第几个单元格，第一个单元格值为0
     */
    @JsonProperty("ysc")
    private Integer ysc;

}
