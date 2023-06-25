package io.github.ealenxie.goodcang;

import io.github.ealenxie.goodcang.product.*;
import io.github.ealenxie.goodcang.vo.ResponseAsk;
import io.github.ealenxie.goodcang.vo.ResponsePage;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 13:30
 * 商品信息
 */
public class ProductInfoClient extends GoodCangClient {
    public ProductInfoClient() {
        this(new RestTemplate());
    }

    public ProductInfoClient(RestOperations restOperations) {
        super(restOperations);
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/get_category">获取商品品类</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     */
    public ResponseAsk<List<Category>> getCategory(String appKey, String appToken) {
        return postGoodCang("/product/get_category", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<List<Category>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/get_declare_commodity_name_list">获取建议中文申报品名</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     */
    public ResponseAsk<DeclareListResponse> getDeclareCommodityNameList(String appKey, String appToken) {
        return postGoodCang("/product/get_declare_commodity_name_list", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<DeclareListResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/get_declare_commodity_name_list">获取建议材质</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     */
    public ResponseAsk<MaterialListResponse> getMaterialList(String appKey, String appToken) {
        return postGoodCang("/product/get_material_list", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<MaterialListResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/add_product">新建商品</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ProductResponse addProduct(String appKey, String appToken, AddProductPayload payload) {
        return postGoodCang("/product/add_product", appKey, appToken, payload, new ParameterizedTypeReference<ProductResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/edit_product">修改商品</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ProductResponse editProduct(String appKey, String appToken, EditProductPayload payload) {
        return postGoodCang("/product/edit_product", appKey, appToken, payload, new ParameterizedTypeReference<ProductResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/get_product_sku_list">获取商品列表</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ResponsePage<List<ProductSkuResponse>> getProductSkuList(String appKey, String appToken, ProductSkuListPayload payload) {
        return postGoodCang("/product/get_product_sku_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponsePage<List<ProductSkuResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/print_sku">获取SKU标签文件</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ResponseAsk<PrintSkuResponse> printSku(String appKey, String appToken, PrintSkuPayload payload) {
        return postGoodCang("/product/print_sku", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<PrintSkuResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/add_import_country">新增商品进口国数据</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ResponseAsk<Void> addImportCountry(String appKey, String appToken, AddImportCountryPayload payload) {
        return postGoodCang("/product/add_import_country", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/update_customs_clearance">更新商品清关信息</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ResponseAsk<Void> updateCustomsClearance(String appKey, String appToken, UpdateCustomsClearancePayload payload) {
        return postGoodCang("/product/update_customs_clearance", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/modify_product_status">修改商品状态</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ResponseAsk<Void> modifyProductStatus(String appKey, String appToken, ModifyProductStatusPayload payload) {
        return postGoodCang("/product/modify_product_status", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/product_freeze_list">获取冻结商品列表</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ResponseAsk<ProductFreezeListResponse> productFreezeList(String appKey, String appToken, ProductFreezeListPayload payload) {
        return postGoodCang("/product/product_freeze_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<ProductFreezeListResponse>>() {
        });
    }


    /**
     * <a href="https://open.goodcang.com/docs_api/product/product_freeze_detail">获取冻结商品详情</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param id       冻结Id
     */
    public ResponseAsk<ProductFreezeDetailResponse> productFreezeDetail(String appKey, String appToken, String id) {
        return postGoodCang("/product/product_freeze_detail", appKey, appToken, new IdPayload(id), new ParameterizedTypeReference<ResponseAsk<ProductFreezeDetailResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/create_serial_number">新增序列号</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ResponseAsk<List<SnResponse>> createSerialNumber(String appKey, String appToken, SnListPayload payload) {
        return postGoodCang("/product/create_serial_number", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<List<SnResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/discard_serial_number">废弃序列号</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ResponseAsk<List<SnResponse>> discardSerialNumber(String appKey, String appToken, SnListPayload payload) {
        return postGoodCang("/product/discard_serial_number", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<List<SnResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/serial_number_list">获取序列号列表</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param payload  请求参数
     */
    public ResponseAsk<SerialNumberListResponse> serialNumberList(String appKey, String appToken, SerialNumberListPayload payload) {
        return postGoodCang("/product/serial_number_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<SerialNumberListResponse>>() {
        });
    }


}
