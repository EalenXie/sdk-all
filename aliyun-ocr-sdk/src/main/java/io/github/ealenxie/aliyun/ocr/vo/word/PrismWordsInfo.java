package io.github.ealenxie.aliyun.ocr.vo.word;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.vo.Points;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/11 13:44
 */
@Getter
@Setter
public class PrismWordsInfo {
    /**
     * 文字块的角度
     */
    @JsonProperty("angle")
    private Integer angle;
    /**
     * direction
     */
    @JsonProperty("direction")
    private Integer direction;
    /**
     * 算法矫正图片后的高度
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * 文字块的外矩形四个点的坐标按顺时针排列（左上、右上、右下、左下）。
     * 当NeedRotate=true时，如果最外层的angle不为0，需要按照angle矫正图片后，坐标才准确。
     */
    @JsonProperty("pos")
    private List<Points> pos;
    /**
     * prob
     */
    @JsonProperty("prob")
    private Integer prob;
    /**
     * 算法矫正图片后的宽度
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * 文字块的文字内容
     */
    @JsonProperty("word")
    private String word;
    /**
     * x
     */
    @JsonProperty("x")
    private Integer x;
    /**
     * y
     */
    @JsonProperty("y")
    private Integer y;


    /**
     * 表格中单元格的id（当OutputTable=true时，返回此字段）
     */
    @JsonProperty("tableCellId")
    private Integer tableCellId;
    /**
     * 表格的id（当OutputTable=true时，返回此字段）
     */
    @JsonProperty("tableId")
    private Integer tableId;

}
