package io.github.ealenxie.goodcang;

import io.github.ealenxie.goodcang.vo.ResponseAsk;
import io.github.ealenxie.goodcang.vo.ResponsePage;
import io.github.ealenxie.goodcang.warehouse.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 17:38
 * 海外仓配
 */
public class WarehouseClient extends GoodCangClient {
    private final String appKey;
    private final String appToken;

    public WarehouseClient(String appKey, String appToken) {
        this(new RestTemplate(), appKey, appToken);
    }

    public WarehouseClient(RestOperations restOperations, String appKey, String appToken) {
        super(restOperations);
        this.appKey = appKey;
        this.appToken = appToken;
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_vat_list">进出口商列表</a>
     */
    public ResponseAsk<List<Vat>> getInboundOrderVatList(PagePayload payload) {
        return postGoodCang("/inbound_order/get_vat_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<List<Vat>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_smcode_twc_to_warehouse">获取物流产品与目的仓中转仓</a>
     */
    public ResponseAsk<SmCodeTwcToWarehouseResponse> getSmCodeTwcToWarehouse() {
        return postGoodCang("/inbound_order/get_smcode_twc_to_warehouse", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<SmCodeTwcToWarehouseResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/create_grn">创建入库单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ReceivingCodePayload> createGrn(CreateGrnPayload payload) {
        return postGoodCang("/inbound_order/create_grn", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<ReceivingCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/modify_grn">编辑入库单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ReceivingCodePayload> modifyGrn(ModifyGrnPayload payload) {
        return postGoodCang("/inbound_order/modify_grn", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<ReceivingCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/del_grn">废弃入库单</a>
     *
     * @param receivingCode 入库单号
     */
    public ResponseAsk<ReceivingCodePayload> delGrn(String receivingCode) {
        return postGoodCang("/inbound_order/del_grn", appKey, appToken, new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ResponseAsk<ReceivingCodePayload>>() {
        });
    }


    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_grn_list">获取入库单列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<GrnInfo>> getGrnList(GrnListPayload payload) {
        return postGoodCang("/inbound_order/get_grn_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponsePage<List<GrnInfo>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_grn_detail">获取入库单明细</a>
     *
     * @param receivingCode 入库单号
     */
    public ResponseAsk<GrnDetail> getGrnDetail(String receivingCode) {
        return postGoodCang("/inbound_order/get_grn_detail", appKey, appToken, new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ResponseAsk<GrnDetail>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/del_asn_box">删除入库单箱唛</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<List<String>> delAsnBox(DelAsnBoxPayload payload) {
        return postGoodCang("/inbound_order/del_asn_box", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<List<String>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/print_gc_receiving_box">打印箱唛</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ImageResponse> printGcReceivingBox(PrintGcReceivingBoxPayload payload) {
        return postGoodCang("/inbound_order/print_gc_receiving_box", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<ImageResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_batch">获取上架批次</a>
     *
     * @param receivingCode 入库单号
     */
    public ResponseAsk<List<PutawayResponse>> getBatch(String receivingCode) {
        return postGoodCang("/inbound_order/get_batch", appKey, appToken, new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ResponseAsk<List<PutawayResponse>>>() {
        });
    }





}
