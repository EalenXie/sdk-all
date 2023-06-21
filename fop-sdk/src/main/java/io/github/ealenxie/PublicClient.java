package io.github.ealenxie;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.common.dto.*;
import io.github.ealenxie.common.vo.*;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 22:55
 * 公共服务
 */
public class PublicClient extends FopClient {


    public PublicClient() {

    }

    public PublicClient(RestOperations restOperations) {
        super(restOperations);
    }

    public PublicClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=121">创建申报产品</a>
     */
    public FopResp<DeclareProductCodeVO> declareCreate(AppKeySecret appKeySecret, DeclareCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.declare.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<DeclareProductCodeVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=122">批量查询申报产品</a>
     */
    public FopResp<DeclareProductList> declareList(AppKeySecret appKeySecret, DeclareList dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.declare.getlist");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<DeclareProductList>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=123">申报产品关联SKU</a>
     */
    public FopResp<DeclareProductCodeVO> skuBindDeclare(AppKeySecret appKeySecret, SkuBindDeclare dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.declare.skubinddeclare");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<DeclareProductCodeVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=124">修改申报产品</a>
     */
    public FopResp<DeclareProductCodeVO> declareEdit(AppKeySecret appKeySecret, DeclareCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.declare.edit");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<DeclareProductCodeVO>>() {
        });
    }

    /**
     * <a href="https://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=125">查询计量单位</a>
     */
    public FopResp<List<MeasureUnit>> measureUnitList(AppKeySecret appKeySecret) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.measureunit.getlist");
        return readFopBody(callFop(HttpMethod.POST, common, null), new TypeReference<FopResp<List<MeasureUnit>>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=127">查询物流产品信息</a>
     */
    public FopResp<List<LogisticsProduct>> logisticsProductList(AppKeySecret appKeySecret, LogisticsProductList dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.logistics_product.getlist");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<List<LogisticsProduct>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=128">查询申报产品种类</a>
     */
    public FopResp<DeclareCategoryListVO> getCategory(AppKeySecret appKeySecret, GetCategory dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.declare.getcategory");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<DeclareCategoryListVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=144">费用试算</a>
     */
    public FopResp<List<PriceCalculatorVO>> priceCalculator(AppKeySecret appKeySecret, PriceCalculator dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.css.price_calculator");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<List<PriceCalculatorVO>>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=153">查询仓库信息</a>
     */
    public FopResp<List<Warehouse>> warehouseList(AppKeySecret appKeySecret, WarehouseList dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.warehouse.getlist");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<List<Warehouse>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=159">费用查询</a>
     *
     * @param dto 请求参数
     */
    public FopResp<BillingList> billing(AppKeySecret appKeySecret, GetBilling dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.billing.getbilling");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<BillingList>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=161">申报产品绑定国家</a>
     */
    public FopResp<DeclareProductCodeVO> countryBindDeclare(AppKeySecret appKeySecret, CountryBindDeclare dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.declare.countrybinddeclare");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<DeclareProductCodeVO>>() {
        });
    }


}
