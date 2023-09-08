package io.github.ealenxie.payoneer;

import io.github.ealenxie.payoneer.account.BalancesResponse;
import io.github.ealenxie.payoneer.account.ReceivingAccountsResponse;
import io.github.ealenxie.payoneer.transaction.TransactionsQueryParams;
import io.github.ealenxie.payoneer.transaction.TransactionsResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * Created by EalenXie on 2022/3/29 11:36
 * <a href="https://developer.payoneer.com/">派安盈 跨境收款</a>
 */
public class PayoneerClient extends RestClient {

    public PayoneerClient(String clientId, String clientSecret) {
        super(clientId, clientSecret, new RestTemplate());
    }

    public PayoneerClient(String clientId, String clientSecret, RestOperations restOperations) {
        super(clientId, clientSecret, restOperations);
    }

    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/b3A6MzU2Nzc0MjA-get-account-balances">获取与 account_id 关联的所有接收帐户的余额(返回总余额)</a>
     *
     * @param accessToken 访问令牌
     * @param accountId   账户Id
     */
    public ResultResponse<BalancesResponse> accountBalances(String accessToken, String accountId) {
        return get(String.format("/v4/accounts/%s/balances", accountId), accessToken, null, new ParameterizedTypeReference<ResultResponse<BalancesResponse>>() {
        });
    }

    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/05ebea2fe666a-get-receiving-accounts">获取与 account_id关联的所有收款账户(每个账号的余额)</a>
     *
     * @param accessToken 访问令牌
     * @param accountId   账户Id
     */
    public ResultResponse<ReceivingAccountsResponse> receivingAccounts(String accessToken, String accountId) {
        return get(String.format("/v4/accounts/%s/receiving_accounts", accountId), accessToken, null, new ParameterizedTypeReference<ResultResponse<ReceivingAccountsResponse>>() {
        });
    }


    /**
     * <a href="https://developer.payoneer.com/docs/get-transactions-v4.html#/b3A6MzU2Nzc0MTI-get-transactions">Get Transactions</a>
     * <p>获取与 account_id 关联的所有收款帐户在一定日期范围内的交易流水。返回的事务数由 page_size 参数指定。后续调用会检索额外的交易数据页面。</p>
     *
     * @param accessToken 访问令牌
     * @param accountId   账号id
     */
    public ResultResponse<TransactionsResponse> transactions(String accessToken, String accountId, TransactionsQueryParams queryParams) {
        return get(String.format("/v4/accounts/%s/transactions", accountId), accessToken, queryParams, new ParameterizedTypeReference<ResultResponse<TransactionsResponse>>() {
        });
    }


}
