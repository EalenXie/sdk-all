package io.github.ealenxie.paypal.referencedpayouts;

/**
 * @author lanzhi
 * Created on 2023/7/25 15:04
 **/
public enum DirectiveType {
    /**
     * The paypal provided ID of the financial instrument that receives the payout.
     */
    FINANCIAL_INSTRUMENT_ID,
    /**
     * 	The valid paypal email address of an account that receives the payout.
     */
    EMAIL,
    /**
     * 	The payer id of a valid paypal account that receives the payout.
     */
    ACCOUNT_ID
}
