package io.github.ealenxie;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.dto.*;
import io.github.ealenxie.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/8/31 15:31
 **/
public class SellerSpriteClient extends RestClient {


    public SellerSpriteClient() {
    }

    public SellerSpriteClient(RestOperations restOperations) {
        super(restOperations);
    }

    public SellerSpriteClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }


    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">选产品</a>
     */
    public Result<ProductChoose> productChoose(String accessToken, ProductQueryParams params) {
        return post("/v1/product/research", accessToken, params, new ParameterizedTypeReference<Result<ProductChoose>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">查竞品</a>
     */
    public Result<ProductCompetitor> competitorLookup(String accessToken, CompetitorQueryParams params) {
        return post("/v1/product/competitor-lookup", accessToken, params, new ParameterizedTypeReference<Result<ProductCompetitor>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">查产品类目</a>
     */
    public Result<List<Node>> productNode(String accessToken, NodeQueryParams params) {
        return get("/v1/product/node", accessToken, params, new ParameterizedTypeReference<Result<List<Node>>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">关键词挖掘</a>
     */
    public Result<KeywordMiner> keywordMiner(String accessToken, KeywordQueryParams params) {
        return post("/v1/keyword/miner", accessToken, params, new ParameterizedTypeReference<Result<KeywordMiner>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">关键词反查</a>
     */
    public Result<TrafficKeyword> trafficKeyword(String accessToken, TrafficQueryParams params) {
        return post("/v1/traffic/keyword", accessToken, params, new ParameterizedTypeReference<Result<TrafficKeyword>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">查询 asin 详情</a>
     */
    public Result<AsinDetail> asinDetail(String accessToken, String marketplace, String asin, AsinQueryParams params) {
        return get(String.format("/v1/asin/%s/%s", marketplace, asin), accessToken, params, new ParameterizedTypeReference<Result<AsinDetail>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">谷歌趋势</a>
     */
    public Result<GoogleTrends> googleTrends(String accessToken, GoogleTrendsQueryParams params) {
        return get("/v1/google/trends", accessToken, params, new ParameterizedTypeReference<Result<GoogleTrends>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">关键词选品</a>
     */
    public Result<KeywordResearch> keywordResearch(String accessToken, KeywordResearchQueryParams params) {
        return post("/v1/keyword-research", accessToken, params, new ParameterizedTypeReference<Result<KeywordResearch>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">关键词趋势选品</a>
     */
    public Result<KeywordResearchTrends> keywordResearchTrends(String accessToken, KeywordResearchTrendsQueryParams params) {
        return post("/v1/keyword-research/trends", accessToken, params, new ParameterizedTypeReference<Result<KeywordResearchTrends>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">关键词选品类目</a>
     */
    public Result<KeywordDepartment> keywordDepartment(String accessToken, KeywordDepartmentQueryParams params) {
        return get("/v1/keyword-research/department", accessToken, params, new ParameterizedTypeReference<Result<KeywordDepartment>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">关联流量统计</a>
     */
    public Result<TrafficStat> trafficListingStat(String accessToken, String marketplace, String asin) {
        return get(String.format("/v1/traffic/listing/stat/%s/%s", marketplace, asin), accessToken, null, new ParameterizedTypeReference<Result<TrafficStat>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">关联流量列表</a>
     */
    public Result<TrafficListing> trafficListing(String accessToken, TrafficListingQueryParams params) {
        return post("/v1/traffic/listing", accessToken, params, new ParameterizedTypeReference<Result<TrafficListing>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">流量词统计</a>
     */
    public Result<TrafficKeywordStat> trafficKeywordStat(String accessToken, String marketplace, String asin) {
        return get(String.format("/v1/traffic/keyword/stat/%s/%s", marketplace, asin), accessToken, null, new ParameterizedTypeReference<Result<TrafficKeywordStat>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">BSR销量预测</a>
     */
    public Result<PredictionBsr> predictionBsr(String accessToken, PredictionBsrQueryParams params) {
        return get("/v1/sales/prediction/bsr", accessToken, params, new ParameterizedTypeReference<Result<PredictionBsr>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">ASIN销量预测</a>
     */
    public Result<PredictionAsin> predictionAsin(String accessToken, PredictionAsinQueryParams params) {
        return get("/v1/sales/prediction/asin", accessToken, params, new ParameterizedTypeReference<Result<PredictionAsin>>() {
        });
    }

    /**
     * <a href="https://shimo.im/docs/YJYyVGqvwGKTxPP3/read">ABA数据选品</a>
     */
    public Result<AbaResearch> abaResearch(String accessToken, AbaResearchQueryParams params) {
        return post("/v1/aba/research", accessToken, params, new ParameterizedTypeReference<Result<AbaResearch>>() {
        });
    }
}