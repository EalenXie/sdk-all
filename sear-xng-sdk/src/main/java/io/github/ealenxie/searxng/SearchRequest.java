package io.github.ealenxie.searxng;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class SearchRequest {
    private String q;                     // 搜索关键词（必需）
    private String format = "json";        // 返回格式，固定为json
    private String categories;             // 类别，逗号分隔
    private String engines;                // 搜索引擎，逗号分隔
    private String language;               // 语言代码，如 zh, en
    private Integer pageno;                 // 页码
    private String timeRange;               // 时间范围：day, month, year
    private Integer safesearch;             // 安全搜索：0,1,2
    private Map<String, String> extraParams = new HashMap<>(); // 其他扩展参数

    // 将请求对象转换为参数Map，用于构建URL
    public Map<String, String> toParams() {
        Map<String, String> params = new HashMap<>();
        params.put("q", q);
        params.put("format", format);
        if (categories != null) params.put("categories", categories);
        if (engines != null) params.put("engines", engines);
        if (language != null) params.put("language", language);
        if (pageno != null) params.put("pageno", pageno.toString());
        if (timeRange != null) params.put("time_range", timeRange);
        if (safesearch != null) params.put("safesearch", safesearch.toString());
        params.putAll(extraParams);
        return params;
    }
}