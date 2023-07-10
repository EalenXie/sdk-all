aliyun-ocr-sdk
===========

<img src="https://img.alicdn.com/tfs/TB13DzOjXP7gK0jSZFjXXc5aXXa-212-48.png" alt="Aliyun Logo" width="200">

主要是封装了阿里云市场 [文字识别（OCR）](https://help.aliyun.com/document_detail/442243.html)接口,
同样推荐使用[官方SDK](https://help.aliyun.com/document_detail/295361.html?spm=a2c4g.294602.0.0.7d6b273fcuQtyU)

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>aliyun-ocr-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### 代码示例

```java

import io.github.ealenxie.aliyun.ocr.InvoiceClient;
import io.github.ealenxie.aliyun.ocr.dto.UrlFilePayload;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import io.github.ealenxie.aliyun.ocr.vo.invoice.Invoice;

class InvoiceClientTest {
    @Test
    void recognizeInvoice() {
        String accessKeyId = "your accessKeyId";
        String accessKeySecret = "your accessKeySecret";
        InvoiceClient invoiceClient = new InvoiceClient(accessKeyId, accessKeySecret);
        UrlFilePayload payload = new UrlFilePayload();
        // 您的图片地址
        payload.setUrl("");
        RecognizeData<Invoice> recognizeData = invoiceClient.recognizeInvoice(payload);
        System.out.println(recognizeData);
    }
}

```

### [票据凭证识别](https://help.aliyun.com/document_detail/442265.html)

#### [InvoiceClient](https://github.com/EalenXie/sdk-all/blob/main/aliyun-ocr-sdk/src/main/java/io/github/ealenxie/aliyun/ocr/InvoiceClient.java) 已支持的接口列表

| 🏷️方法名                           | 📚 官方文档地址                                                          | 状态  |
|:---------------------------------|:-------------------------------------------------------------------|:----|
| recognizeMixedInvoices           | [混贴发票识别](https://help.aliyun.com/document_detail/442266.htm)       | ✔️  |
| recognizeInvoice                 | [增值税发票识别](https://help.aliyun.com/document_detail/442267.htm)      | ✔️  |
| recognizeCarInvoice              | [机动车统一销售发票识别](https://help.aliyun.com/document_detail/442268.html) | ✔️  |
| recognizeQuotaInvoice            | [定额发票识别](https://help.aliyun.com/document_detail/442269.html)      | ✔️  |
| recognizeAirItinerary            | [航空行程单识别](https://help.aliyun.com/document_detail/442270.html)     | ✔️  |
| recognizeTrainInvoice            | [火车票识别](https://help.aliyun.com/document_detail/442271.html)       | ✔️  |
| recognizeTaxiInvoice             | [出租车发票识别](https://help.aliyun.com/document_detail/442272.html)     | ✔️  |
| recognizeRollTicket              | [增值税发票卷票识别](https://help.aliyun.com/document_detail/442273.html)   | ✔️  |
| recognizeBankAcceptance          | [银行承兑汇票识别](https://help.aliyun.com/document_detail/442274.html)    | ✔️  |
| recognizeBusShipTicket           | [客运车船票识别](https://help.aliyun.com/document_detail/442275.html)     | ✔️  |
| recognizeNonTaxInvoice           | [非税收入发票识别](https://help.aliyun.com/document_detail/442276.html)    | ✔️  |
| recognizeCommonPrintedInvoice    | [通用机打发票识别](https://help.aliyun.com/document_detail/442277.html)    | ✔️  |
| recognizeHotelConsume            | [酒店流水识别](https://help.aliyun.com/document_detail/442278.html)      | ✔️  |
| recognizePaymentRecord           | [支付详情页识别](https://help.aliyun.com/document_detail/442279.html)     | ✔️  |
| recognizePurchaseRecord          | [电商订单页识别](https://help.aliyun.com/document_detail/442280.html)     | ✔️  |
| recognizeRideHailingItinerary    | [网约车行程单识别](https://help.aliyun.com/document_detail/442281.html)    | ✔️  |
| recognizeShoppingReceipt         | [购物小票识别](https://help.aliyun.com/document_detail/442282.html)      | ✔️  |
| recognizeSocialSecurityCard      | [社会保障卡识别](https://help.aliyun.com/document_detail/442283.html)     | ✔️  |
| recognizeTollInvoice             | [过路过桥费发票识别](https://help.aliyun.com/document_detail/442284.html)   | ✔️  |
| recognizeTaxClearanceCertificate | [税收完税证明识别](https://help.aliyun.com/document_detail/442285.html)    | ✔️  |
| recognizeUsedCarInvoice          | [二手车统一销售发票识别](https://help.aliyun.com/document_detail/442286.html) | ✔️  |

### [个人证照识别](https://help.aliyun.com/document_detail/442254.html)

#### [CertificateClient](https://github.com/EalenXie/sdk-all/blob/main/aliyun-ocr-sdk/src/main/java/io/github/ealenxie/aliyun/ocr/CertificateClient.java) 已支持的接口列表

| 🏷️方法名                               | 📚 官方文档地址                                                            | 状态  |
|:-------------------------------------|:---------------------------------------------------------------------|:----|
| recognizeIdCard                      | [身份证识别](https://help.aliyun.com/document_detail/442255.htm)          | ✔️  |
| recognizePassport                    | [护照识别](https://help.aliyun.com/document_detail/442256.htm)           | ✔️  |
| recognizeHousehold                   | [户口本识别](https://help.aliyun.com/document_detail/442257.html)         | ✔️  |
| recognizeEstateCertification         | [不动产权证识别](https://help.aliyun.com/document_detail/442258.html)       | ✔️  |
| recognizeBankCard                    | [银行卡识别](https://help.aliyun.com/document_detail/442259.html)         | ✔️  |
| recognizeBirthCertification          | [出生证明识别](https://help.aliyun.com/document_detail/442260.html)        | ✔️  |
| recognizeExitEntryPermitToMainland   | [来往大陆（内地）通行证识别](https://help.aliyun.com/document_detail/442262.html) | ✔️  |
| recognizeExitEntryPermitToHK         | [往来港澳台通行证识别](https://help.aliyun.com/document_detail/442263.html)    | ✔️  |
| recognizeSocialSecurityCardVersionII | [社保卡识别](https://help.aliyun.com/document_detail/442264.html)         | ✔️  |
| recognizeInternationalIdCard         | [国际身份证识别](https://help.aliyun.com/document_detail/455939.html)       | ✔️  |

### [企业资质识别](https://help.aliyun.com/document_detail/442287.html)

#### [QualificationClient](https://github.com/EalenXie/sdk-all/blob/main/aliyun-ocr-sdk/src/main/java/io/github/ealenxie/aliyun/ocr/QualificationClient.java) 已支持的接口列表

| 🏷️方法名                                  | 📚 官方文档地址                                                              | 状态  |
|:----------------------------------------|:-----------------------------------------------------------------------|:----|
| recognizeBusinessLicense                | [营业执照识别](https://help.aliyun.com/document_detail/442288.htm)           | ✔️  |
| recognizeBankAccountLicense             | [银行开户许可证识别](https://help.aliyun.com/document_detail/442289.htm)        | ✔️  |
| recognizeTradeMarkCertification         | [商标注册证识别](https://help.aliyun.com/document_detail/442290.html)         | ✔️  |
| recognizeFoodProduceLicense             | [食品生产许可证识别](https://help.aliyun.com/document_detail/442291.html)       | ✔️  |
| recognizeFoodManageLicense              | [食品经营许可证识别](https://help.aliyun.com/document_detail/442292.html)       | ✔️  |
| recognizeMedicalDeviceManageLicense     | [医疗器械经营许可证识别](https://help.aliyun.com/document_detail/442293.html)     | ✔️  |
| recognizeMedicalDeviceProduceLicense    | [医疗器械生产许可证识别](https://help.aliyun.com/document_detail/442294.html)     | ✔️  |
| recognizeCTwoMedicalDeviceManageLicense | [第二类医疗器械经营备案凭证识别](https://help.aliyun.com/document_detail/442295.html) | ✔️  |
| recognizeCosmeticProduceLicense         | [化妆品生产许可证识别](https://help.aliyun.com/document_detail/442296.html)      | ✔️  |
| recognizeInternationalBusinessLicense   | [国际企业执照识别](https://help.aliyun.com/document_detail/463487.html)        | ✔️  |

### [车辆物流识别](https://help.aliyun.com/document_detail/442297.html)

#### [CarClient](https://github.com/EalenXie/sdk-all/blob/main/aliyun-ocr-sdk/src/main/java/io/github/ealenxie/aliyun/ocr/CarClient.java) 已支持的接口列表

| 🏷️方法名                        | 📚 官方文档地址                                                        | 状态  |
|:------------------------------|:-----------------------------------------------------------------|:----|
| recognizeVehicleLicense       | [行驶证识别](https://help.aliyun.com/document_detail/442298.htm)      | ✔️  |
| recognizeDrivingLicense       | [驾驶证识别](https://help.aliyun.com/document_detail/442299.htm)      | ✔️  |
| recognizeWaybill              | [电子面单识别](https://help.aliyun.com/document_detail/442300.htm)     | ✔️  |
| recognizeCarNumber            | [车牌识别](https://help.aliyun.com/document_detail/442301.htm)       | ✔️  |
| recognizeCarVinCode           | [车辆vin码识别](https://help.aliyun.com/document_detail/442302.htm)   | ✔️  |
| recognizeVehicleRegistration  | [机动车注册登记证识别](https://help.aliyun.com/document_detail/442303.htm) | ✔️  |
| recognizeVehicleCertification | [车辆合格证识别](https://help.aliyun.com/document_detail/442304.htm)    | ✔️  |

### [票证核验](https://help.aliyun.com/document_detail/465265.html)

#### [InvoiceVerifyClient](https://github.com/EalenXie/sdk-all/blob/main/aliyun-ocr-sdk/src/main/java/io/github/ealenxie/aliyun/ocr/InvoiceVerifyClient.java) 已支持的接口列表

| 🏷️方法名                | 📚 官方文档地址                                                    | 状态  |
|:----------------------|:-------------------------------------------------------------|:----|
| verifyBusinessLicense | [营业执照核验](https://help.aliyun.com/document_detail/465204.htm) | ✔️  |
| verifyVATInvoice      | [发票核验](https://help.aliyun.com/document_detail/465205.htm)   | ✔️  |

