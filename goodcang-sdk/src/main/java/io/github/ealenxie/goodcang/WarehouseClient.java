package io.github.ealenxie.goodcang;

import io.github.ealenxie.goodcang.vo.ResponseAsk;
import io.github.ealenxie.goodcang.warehouse.PagePayload;
import io.github.ealenxie.goodcang.warehouse.SmCodeTwcToWarehouseResponse;
import io.github.ealenxie.goodcang.warehouse.Vat;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 17:38
 * 海外仓配
 */
public class WarehouseClient extends GoodCangClient {

    public WarehouseClient() {
        this(new RestTemplate());
    }

    public WarehouseClient(RestOperations restOperations) {
        super(restOperations);
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_vat_list">进出口商列表</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     */
    public ResponseAsk<List<Vat>> getInboundOrderVatList(String appKey, String appToken, PagePayload payload) {
        return postGoodCang("/inbound_order/get_vat_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<List<Vat>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_smcode_twc_to_warehouse">获取物流产品与目的仓中转仓</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     */
    public ResponseAsk<SmCodeTwcToWarehouseResponse> getSmCodeTwcToWarehouse(String appKey, String appToken) {
        return postGoodCang("/inbound_order/get_smcode_twc_to_warehouse", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<SmCodeTwcToWarehouseResponse>>() {
        });
    }

}
