package io.github.ealenxie.goodcang;

import io.github.ealenxie.goodcang.base.*;
import io.github.ealenxie.goodcang.vo.ResponseAsk;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 11:33
 * 基础资料与工具
 */
public class BaseClient extends GoodCangClient {
    private final String appKey;
    private final String appToken;

    public BaseClient(String appKey, String appToken) {
        this(new RestTemplate(), appKey, appToken);
    }

    public BaseClient(RestOperations restOperations, String appKey, String appToken) {
        super(restOperations);
        this.appKey = appKey;
        this.appToken = appToken;
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/get_country">获取国家/地区列表</a>
     */
    public ResponseAsk<List<Country>> getCountry() {
        return postGoodCang("/base_data/get_country", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<List<Country>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/get_warehouse">获取仓库信息</a>
     */
    public ResponseAsk<List<Warehouse>> getWarehouse() {
        return postGoodCang("/base_data/get_warehouse", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<List<Warehouse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/get_shipping_method">获取物流产品</a>
     *
     * @param warehouseCode 尾程仓库代码
     */
    public ResponseAsk<List<ShippingMethod>> getShippingMethod(String warehouseCode) {
        return postGoodCang("/base_data/get_shipping_method", appKey, appToken, new WarehouseCodePayload(warehouseCode), new ParameterizedTypeReference<ResponseAsk<List<ShippingMethod>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/get_account_list">获取公司账户</a>
     */
    public ResponseAsk<AccountListResponse> getAccountList() {
        return postGoodCang("/base_data/get_account_list", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<AccountListResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/cost_type_list">获取费用类型</a>
     *
     * @param signBusinessType 费用业务类型
     */
    public ResponseAsk<List<CostType>> costTypeList(Integer signBusinessType) {
        return postGoodCang("/base_data/cost_type_list", appKey, appToken, new SignBusinessTypePayload(signBusinessType), new ParameterizedTypeReference<ResponseAsk<List<CostType>>>() {
        });
    }


    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/fuel_rate_list">获取燃油费率</a>
     *
     * @param payload 费用业务类型
     */
    public ResponseAsk<FuelRateResponse> fuelRateList(FuelRatePayload payload) {
        return postGoodCang("/base_data/fuel_rate_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<FuelRateResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/fuel_rate_list">获取异步任务结果列表</a>
     *
     * @param requestIdList 请求id数组
     */
    public ResponseAsk<List<TaskStatus>> taskStatusList(List<String> requestIdList) {
        return postGoodCang("/base_data/task_status_list", appKey, appToken, new TaskStatusListPayload(requestIdList), new ParameterizedTypeReference<ResponseAsk<List<TaskStatus>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/sys_base_info">获取业务基础数据信息</a>
     */
    public ResponseAsk<BaseInfoResponse> sysBaseInfo() {
        return postGoodCang("/base_data/sys_base_info", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<BaseInfoResponse>>() {
        });

    }


    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/upload_attachment">上传附件</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<AttachmentResponse> uploadAttachment(UploadAttachmentPayload payload) {
        return postGoodCang("/base_data/upload_attachment", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<AttachmentResponse>>() {
        });
    }


    /**
     * <a href="https://open.goodcang.com/docs_api/inventory/get_calculate_delivery_fee">运费试算</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<List<CalculateDeliveryFee>> getCalculateDeliveryFee(CalculateDeliveryFeePayload payload) {
        return postGoodCang("/inventory/get_calculate_delivery_fee", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<List<CalculateDeliveryFee>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/address/verify_address_info">地址校验</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<VerifyAddressInfoResponse> verifyAddressInfo(VerifyAddressInfoPayload payload) {
        return postGoodCang("/address/verify_address_info", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<VerifyAddressInfoResponse>>() {
        });
    }
}
