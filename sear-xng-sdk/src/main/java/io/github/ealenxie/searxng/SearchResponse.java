package io.github.ealenxie.searxng;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class SearchResponse {
    private String query;
    @JsonProperty("number_of_results")
    private Long numberOfResults;
    @JsonProperty("results")
    private List<Result> results;
    @JsonProperty("infoboxes")
    private List<Infobox> infoboxes;
    @JsonProperty("suggestions")
    private List<String> suggestions;
    @JsonProperty("answers")
    private List<Answer> answers;
    @JsonProperty("unresponsive_engines")
    private List<String[]> unresponsiveEngines;

    @Getter
    @Setter
    public static class Result {
        private String title;
        private String url;
        private String content;
        private String engine;
        @JsonProperty("publishedDate")
        private String publishedDate;
        private String template;
        @JsonProperty("parsed_url")
        private List<String> parsedUrl;
        private String thumbnail;
        private String imageSrc;
        private String priority;
        private List<BigDecimal> position;
        private List<String> engines;
        private BigDecimal score;
        private String category;
    }

    @Getter
    @Setter
    public static class Infobox {
        private String infobox;
        private String content;
        private List<Map<String, Object>> attributes;
        private List<Map<String, String>> urls;
    }

    @Getter
    @Setter
    public static class Answer {
        private String answer;
        @JsonProperty("url")
        private String url;
    }
}