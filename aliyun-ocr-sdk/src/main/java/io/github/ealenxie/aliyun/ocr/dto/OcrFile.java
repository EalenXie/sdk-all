package io.github.ealenxie.aliyun.ocr.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface OcrFile {


    @JsonIgnore
    byte[] getBytes();

}
