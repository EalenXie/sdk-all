package io.github.ealenxie.aliyun.ocr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.aliyun.ocr.dto.UrlFileDTO;
import io.github.ealenxie.aliyun.ocr.vo.OcrResponse;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import io.github.ealenxie.aliyun.ocr.vo.invoice.*;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2023/3/23 10:47
 * <p>
 * <a href="https://help.aliyun.com/document_detail/442265.html">票据凭证识别</a>
 */
public class InvoiceClient extends OcrClient {

    public InvoiceClient(String accessKeyId, String accessKeySecret) {
        super(accessKeyId, accessKeySecret);
    }

    public InvoiceClient(String accessKeyId, String accessKeySecret, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, restOperations);
    }

    public InvoiceClient(String accessKeyId, String accessKeySecret, ObjectMapper objectMapper, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, objectMapper, restOperations);
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442266.html">混贴发票识别</a>
     *
     * @param dto 请求参数
     */
    public MixedInvoices recognizeMixedInvoices(UrlFileDTO dto) {
        return ocr("RecognizeMixedInvoices", dto, MixedInvoices.class).getBody();
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442267.html">增值税发票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<Invoice> recognizeInvoice(UrlFileDTO dto) {
        return getData(ocr("RecognizeInvoice", dto, OcrResponse.class), new TypeReference<RecognizeData<Invoice>>() {
        });
    }


    /**
     * <a href="https://help.aliyun.com/document_detail/442268.html">机动车统一销售发票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<CarInvoice> recognizeCarInvoice(UrlFileDTO dto) {
        return getData(ocr("RecognizeCarInvoice", dto, OcrResponse.class), new TypeReference<RecognizeData<CarInvoice>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442269.html">定额发票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<QuotaInvoice> recognizeQuotaInvoice(UrlFileDTO dto) {
        return getData(ocr("RecognizeQuotaInvoice", dto, OcrResponse.class), new TypeReference<RecognizeData<QuotaInvoice>>() {
        });
    }


    /**
     * <a href="https://help.aliyun.com/document_detail/442270.html">航空行程单识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<AirItinerary> recognizeAirItinerary(UrlFileDTO dto) {
        return getData(ocr("RecognizeAirItinerary", dto, OcrResponse.class), new TypeReference<RecognizeData<AirItinerary>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442271.html">火车票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<TrainInvoice> recognizeTrainInvoice(UrlFileDTO dto) {
        return getData(ocr("RecognizeTrainInvoice", dto, OcrResponse.class), new TypeReference<RecognizeData<TrainInvoice>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442272.html">出租车发票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<TaxiInvoice> recognizeTaxiInvoice(UrlFileDTO dto) {
        return getData(ocr("RecognizeTaxiInvoice", dto, OcrResponse.class), new TypeReference<RecognizeData<TaxiInvoice>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442273.html">增值税发票卷票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<RollTicket> recognizeRollTicket(UrlFileDTO dto) {
        return getData(ocr("RecognizeRollTicket", dto, OcrResponse.class), new TypeReference<RecognizeData<RollTicket>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442274.html">银行承兑汇票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<BankAcceptance> recognizeBankAcceptance(UrlFileDTO dto) {
        return getData(ocr("RecognizeBankAcceptance", dto, OcrResponse.class), new TypeReference<RecognizeData<BankAcceptance>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442275.html">客运车船票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<BusShipTicket> recognizeBusShipTicket(UrlFileDTO dto) {
        return getData(ocr("RecognizeBusShipTicket", dto, OcrResponse.class), new TypeReference<RecognizeData<BusShipTicket>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442276.html">非税收入发票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<NonTaxInvoice> recognizeNonTaxInvoice(UrlFileDTO dto) {
        return getData(ocr("RecognizeNonTaxInvoice", dto, OcrResponse.class), new TypeReference<RecognizeData<NonTaxInvoice>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442277.html">通用机打发票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<CommonPrintedInvoice> recognizeCommonPrintedInvoice(UrlFileDTO dto) {
        return getData(ocr("RecognizeCommonPrintedInvoice", dto, OcrResponse.class), new TypeReference<RecognizeData<CommonPrintedInvoice>>() {
        });
    }


    /**
     * <a href="https://help.aliyun.com/document_detail/442278.html">酒店流水识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<HotelConsume> recognizeHotelConsume(UrlFileDTO dto) {
        return getData(ocr("RecognizeHotelConsume", dto, OcrResponse.class), new TypeReference<RecognizeData<HotelConsume>>() {
        });
    }


    /**
     * <a href="https://help.aliyun.com/document_detail/442279.html">支付详情页识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<PaymentRecord> recognizePaymentRecord(UrlFileDTO dto) {
        return getData(ocr("RecognizePaymentRecord", dto, OcrResponse.class), new TypeReference<RecognizeData<PaymentRecord>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442280.html">电商订单页识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<PurchaseRecord> recognizePurchaseRecord(UrlFileDTO dto) {
        return getData(ocr("RecognizePurchaseRecord", dto, OcrResponse.class), new TypeReference<RecognizeData<PurchaseRecord>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442281.html">网约车行程单识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<RideHailingItinerary> recognizeRideHailingItinerary(UrlFileDTO dto) {
        return getData(ocr("RecognizeRideHailingItinerary", dto, OcrResponse.class), new TypeReference<RecognizeData<RideHailingItinerary>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442282.html">购物小票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<ShoppingReceipt> recognizeShoppingReceipt(UrlFileDTO dto) {
        return getData(ocr("RecognizeShoppingReceipt", dto, OcrResponse.class), new TypeReference<RecognizeData<ShoppingReceipt>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442283.html">社会保障卡识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<SocialSecurityCard> recognizeSocialSecurityCard(UrlFileDTO dto) {
        return getData(ocr("RecognizeSocialSecurityCard", dto, OcrResponse.class), new TypeReference<RecognizeData<SocialSecurityCard>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442284.html">过路过桥费发票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<TollInvoice> recognizeTollInvoice(UrlFileDTO dto) {
        return getData(ocr("RecognizeTollInvoice", dto, OcrResponse.class), new TypeReference<RecognizeData<TollInvoice>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442285.html">税收完税证明识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<TaxClearanceCertificate> recognizeTaxClearanceCertificate(UrlFileDTO dto) {
        return getData(ocr("RecognizeTaxClearanceCertificate", dto, OcrResponse.class), new TypeReference<RecognizeData<TaxClearanceCertificate>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442286.html">二手车统一销售发票识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<UsedCarInvoice> recognizeUsedCarInvoice(UrlFileDTO dto) {
        return getData(ocr("RecognizeUsedCarInvoice", dto, OcrResponse.class), new TypeReference<RecognizeData<UsedCarInvoice>>() {
        });
    }
}
