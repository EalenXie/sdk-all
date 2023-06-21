package io.github.ealenxie.edayun;

import io.github.ealenxie.edayun.dto.*;
import io.github.ealenxie.edayun.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

public class EdayunClient {


    // wms 正式环境
    private static final String WMS_HOST = "http://wms.edayun.cn/omniv4/webservice";

    // wms 沙箱环境
    private static final String WMS_HOST_SANDBOX = "https://test.omniselling.com.cn/omniv4/webservice";


    public EdayunClient() {
        this(new RestTemplate());
    }

    public EdayunClient(RestOperations restOperations) {
        this.restOperations = restOperations;
    }

    private final RestOperations restOperations;
    /**
     * 当前是否沙箱环境
     */
    private boolean sandBox = true;

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }


    /**
     * <b>创建订单</b>
     * <p>接口说明: 客户可以通过本接口创建订单提交到EDA系统。订单的发货仓库和物流在请求的warehouseId和courierAccountId中指定，如果不指定这2个参数，则发货仓库和物流默认使用omni系统的资源配对中的信息。</p>
     * <p>使用场景: 客户使用接口创建订单，一次请求创建一个订单。</p>
     *
     * @param request 创建订单请求参数
     * @return 响应参数
     */
    public Response<CreateOrderVO> createOrderEx(Request<CreateOrderDTO> request) {
        return callWms("/createOrderEx", HttpMethod.POST, request, new ParameterizedTypeReference<Response<CreateOrderVO>>() {
        });
    }

    /**
     * <b>取消订单</b>
     * <p>接口说明: 客户可以通过本接口取消订单。</p>
     * <p>使用场景: 客户取消一个订单，订单在仓库发货前才能取消，订单在状态为发货确认后不能取消。</p>
     *
     * @param businessNum EDA订单号
     * @return 响应参数
     */
    public Response<Boolean> cancelOrder(Request<String> businessNum) {
        return callWms("/cancelOrder", HttpMethod.POST, businessNum, new ParameterizedTypeReference<Response<Boolean>>() {
        });
    }

    /**
     * <b>查询订单</b>
     * <p>接口说明: 通过本接口用户查询创建的订单信息。</p>
     * <p>使用场景: 用户使用接口查询订单的详细信息，不支持批量查询。</p>
     *
     * @param businessNum EDA订单号
     * @return 响应参数
     */
    public Response<OrderVO> getOrderInfoByIdEx(Request<String> businessNum) {
        return callWms("/getOrderInfoByIdEx", HttpMethod.POST, businessNum, new ParameterizedTypeReference<Response<OrderVO>>() {
        });
    }

    /**
     * <b>批量查询订单</b>
     * <p>接口说明: 通过本接口批量查询创建的订单信息，查询条件会不断完善，返回参数与单个查询订单信息是一样的，区别是批量接口会返回多条数据，减少单个查询请求的次数。</p>
     * <p>使用场景: 用户使用接口批量查询订单的详细信息。</p>
     *
     * @param request 批量查询订单请求参数
     * @return 响应参数
     */
    public Response<List<OrderVO>> getOrders(Request<QueryOrdersDTO> request) {
        return callWms("/getOrders", HttpMethod.POST, request, new ParameterizedTypeReference<Response<List<OrderVO>>>() {
        });
    }


    /**
     * <b>创建产品</b>
     * <p>接口说明: 客户可以通过本接口创建产品到EDA系统。如果SKU名称存在了会修改产品的信息.</p>
     * <p>使用场景: 客户使用接口创建产品，一次请求可以创建多个产品。</p>
     *
     * @param request 创建产品请求参数
     * @return 响应参数
     */
    public Response<CreateProductInfo> createProduct(Request<ProductInfo> request) {
        return callWms("/createProduct", HttpMethod.POST, request, new ParameterizedTypeReference<Response<CreateProductInfo>>() {
        });
    }

    /**
     * <b>库存汇总查询扩展接口</b>
     * <p>接口说明: 客户可以通过本接口查询所有指定商品不同仓库的可售库存；输入参数为产品SKU和warehouseId。当warehouseId为空时返回所有有库存记录的仓库的库存信息.</p>
     * <p>使用场景: 客户需要了解产品在所有仓库的库存情况。</p>
     *
     * @param request 库存汇总查询
     * @return 响应参数
     */
    public Response<List<InventoryEx>> queryInventoryEx(Request<QueryInventoryEx> request) {
        return callWms("/queryInventoryEx", HttpMethod.POST, request, new ParameterizedTypeReference<Response<List<InventoryEx>>>() {
        });
    }

    /**
     * <b>库存流水接口</b>
     * <p>接口说明: 客户可以通过本接口查询所有指定商品不同仓库的库存使用情况；输入参数为产品SKU和warehouseId等。当warehouseId等信息为空时返回所有仓库的库存流水。</p>
     * <p>使用场景: 客户需要了解产品在所有仓库的库存销售情况。</p>
     *
     * @param request 库存流水查询
     * @return 响应参数
     */
    public Response<PageData<InventoryHistory>> queryInventoryHistory(Request<QueryInventoryHistory> request) {
        return callWms("/queryInventoryHistory", HttpMethod.POST, request, new ParameterizedTypeReference<Response<PageData<InventoryHistory>>>() {
        });
    }

    /**
     * <b>产品锁库存接口</b>
     * <p>接口说明: 客户可以通过本接口产品锁定库存,产品定库存后不可以售卖；输入参数为产品SKU和warehouseId等。</p>
     * <p>使用场景: 锁定库存客户某些SKU的库存,不可售卖。</p>
     *
     * @param request 锁库参数
     * @return 响应参数
     */
    public Response<LockInventory> lockInventory(Request<LockInventoryDTO> request) {
        return callWms("/lockInventory", HttpMethod.POST, request, new ParameterizedTypeReference<Response<LockInventory>>() {
        });
    }

    /**
     * <b>产品解锁库存接口</b>
     * <p>接口说明: 客户可以通过本接口产品解锁库存,产品解锁库存后可以售卖；输入参数为产品SKU和warehouseId等。</p>
     * <p>使用场景: 解锁库存客户某些SKU的库存,可售卖。</p>
     *
     * @param request 解锁库参数
     * @return 响应参数
     */
    public Response<LockInventory> unLockInventory(Request<LockInventoryDTO> request) {
        return callWms("/unLockInventory", HttpMethod.POST, request, new ParameterizedTypeReference<Response<LockInventory>>() {
        });
    }


    /**
     * <b>库存查询新接口</b>
     * <p>接口说明: 客户可以通过本接口查询所有指定商品不同仓库的可售库存；输入参数为产品SKU和warehouseId。当warehouseId为空时返回所有有库存记录的仓库的库存信息</p>
     * <p>使用场景: 客户需要了解产品在所有仓库的库存情况。</p>
     *
     * @param request 库存流水查询
     * @return 响应参数
     */
    public Response<PageData<Inventory>> queryInventoryV2(Request<QueryInventoryV2> request) {
        return callWms("/queryInventoryV2", HttpMethod.POST, request, new ParameterizedTypeReference<Response<PageData<Inventory>>>() {
        });
    }

    /**
     * <b>查询产品库龄</b>
     * <p>接口说明: ；客户可以通过本接口查询所有指定商品不同仓库的库龄</p>
     * <p>使用场景: 客户需要了解产品在所有仓库的产品库龄情况。</p>
     *
     * @param request 查询产品库龄参数
     * @return 响应参数
     */
    public Response<PageData<InventoryAgeVO>> searchInventoryAge(Request<SearchInventoryAge> request) {
        return callWms("/searchInventoryAge", HttpMethod.POST, request, new ParameterizedTypeReference<Response<PageData<InventoryAgeVO>>>() {
        });
    }

    /**
     * <b>获取公共仓库列表</b>
     * <p>接口说明: ；客户可以通过本接口获取所有仓库信息</p>
     * <p>使用场景: 客户使用接口获取仓库信息，一次请求获取所有公共仓库信息和自己的私有仓库信息。</p>
     *
     * @param request 获取公共仓库
     * @return 响应参数
     */
    public Response<List<WarehouseVO>> listPublicWarehouseInfo(Request<Void> request) {
        return callWms("/listPublicWarehouseInfo", HttpMethod.POST, request, new ParameterizedTypeReference<Response<List<WarehouseVO>>>() {
        });
    }

    /**
     * 调用易达云 wms接口
     *
     * @param name    接口名称
     * @param method  方法名称
     * @param request 请求参数
     * @return 响应结果
     */
    public <T, R> R callWms(String name, HttpMethod method, Request<T> request, ParameterizedTypeReference<R> responseType) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/%s", isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, name));
        URI uri = builder.build().encode().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return restOperations.exchange(uri, method, new HttpEntity<>(request, headers), responseType).getBody();
    }

}
