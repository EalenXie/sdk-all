package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.common.*;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 22:55
 * 公共服务
 */
public class PublicClient extends FopClient {


    public PublicClient(String appKey, String appSecret) {
        super(appKey, appSecret);
    }

    public PublicClient(String appKey, String appSecret, RestOperations restOperations) {
        super(appKey, appSecret, restOperations);
    }

    public PublicClient(String appKey, String appSecret, RestOperations restOperations, ObjectMapper objectMapper) {
        super(appKey, appSecret, restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=121">创建申报产品</a>
     */
    public FopResp<DeclareProductCodePayload> declareCreate(DeclareCreate dto) {
        return postFop("com.basis.declare.create", dto, new TypeReference<FopResp<DeclareProductCodePayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=122">批量查询申报产品</a>
     */
    public FopResp<DeclareProductListResponse> declareList(DeclareList dto) {
        return postFop("com.basis.declare.getlist", dto, new TypeReference<FopResp<DeclareProductListResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=123">申报产品关联SKU</a>
     */
    public FopResp<DeclareProductCodePayload> skuBindDeclare(SkuBindDeclare dto) {
        return postFop("com.basis.declare.skubinddeclare", dto, new TypeReference<FopResp<DeclareProductCodePayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=124">修改申报产品</a>
     */
    public FopResp<DeclareProductCodePayload> declareEdit(DeclareCreate dto) {
        return postFop("com.basis.declare.edit", dto, new TypeReference<FopResp<DeclareProductCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=125">查询计量单位</a>
     */
    public FopResp<List<MeasureUnit>> measureUnitList() {
        return postFop("com.basis.measureunit.getlist", null, new TypeReference<FopResp<List<MeasureUnit>>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=127">查询物流产品信息</a>
     */
    public FopResp<List<LogisticsProduct>> logisticsProductList(LogisticsProductList dto) {
        return postFop("com.basis.logistics_product.getlist", dto, new TypeReference<FopResp<List<LogisticsProduct>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=128">查询申报产品种类</a>
     */
    public FopResp<DeclareCategoryListResponse> getCategory(GetCategory dto) {
        return postFop("com.basis.declare.getcategory", dto, new TypeReference<FopResp<DeclareCategoryListResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=144">费用试算</a>
     */
    public FopResp<List<PriceCalculatorResponse>> priceCalculator(PriceCalculator dto) {
        return postFop("com.css.price_calculator", dto, new TypeReference<FopResp<List<PriceCalculatorResponse>>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=153">查询仓库信息</a>
     */
    public FopResp<List<Warehouse>> warehouseList(WarehouseList dto) {
        return postFop("com.basis.warehouse.getlist", dto, new TypeReference<FopResp<List<Warehouse>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=159">费用查询</a>
     *
     * @param dto 请求参数
     */
    public FopResp<BillingListResponse> billing(GetBilling dto) {
        return postFop("com.basis.billing.getbilling", dto, new TypeReference<FopResp<BillingListResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=161">申报产品绑定国家</a>
     */
    public FopResp<DeclareProductCodePayload> countryBindDeclare(CountryBindDeclare dto) {
        return postFop("com.basis.declare.countrybinddeclare", dto, new TypeReference<FopResp<DeclareProductCodePayload>>() {
        });
    }


}
