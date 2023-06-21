package io.github.ealenxie.aliyun.ocr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.aliyun.ocr.dto.UrlFileDTO;
import io.github.ealenxie.aliyun.ocr.vo.OcrResponse;
import io.github.ealenxie.aliyun.ocr.vo.word.*;
import org.springframework.web.client.RestOperations;

/**
 * @author EalenXie created on 2023/4/11 13:40
 * <p>
 * <a href="https://help.aliyun.com/document_detail/442246.html">通用文字识别</a>
 */
public class WordClient extends OcrClient {
    protected WordClient(String accessKeyId, String accessKeySecret) {
        super(accessKeyId, accessKeySecret);
    }

    protected WordClient(String accessKeyId, String accessKeySecret, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, restOperations);
    }

    protected WordClient(String accessKeyId, String accessKeySecret, ObjectMapper objectMapper, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, objectMapper, restOperations);
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442247.html">全文识别高精版</a>
     *
     * @param dto 请求参数
     */
    public Advanced recognizeAdvanced(RecognizeAdvancedDTO dto) {
        return getData(ocr("RecognizeAdvanced", dto, OcrResponse.class), new TypeReference<Advanced>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442248.html">通用手写体识别</a>
     *
     * @param dto 请求参数
     */
    public WordResponse recognizeHandwriting(RecognizeAdvancedDTO dto) {
        return getData(ocr("RecognizeHandwriting", dto, OcrResponse.class), new TypeReference<WordResponse>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442249.html">电商图片文字识别</a>
     *
     * @param dto 请求参数
     */
    public WordResponse recognizeBasic(UrlFileDTO dto) {
        return getData(ocr("RecognizeBasic", dto, OcrResponse.class), new TypeReference<WordResponse>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442250.html">通用文字识别</a>
     *
     * @param dto 请求参数
     */
    public WordResponse recognizeGeneral(UrlFileDTO dto) {
        return getData(ocr("RecognizeGeneral", dto, OcrResponse.class), new TypeReference<WordResponse>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442251.html">表格识别</a>
     *
     * @param dto 请求参数
     */
    public TableOcr recognizeTableOcr(TableOcrDTO dto) {
        return getData(ocr("RecognizeTableOcr", dto, OcrResponse.class), new TypeReference<TableOcr>() {
        });
    }

}
