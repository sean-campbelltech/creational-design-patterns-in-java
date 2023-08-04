package com.campbelltech.payments;

import com.campbelltech.payments.enums.PaymentMethod;
import com.campbelltech.payments.impl.ApplePayPayment;
import com.campbelltech.payments.impl.CreditCardPayment;
import com.campbelltech.payments.impl.GooglePayPayment;

import java.text.MessageFormat;

public class PaymentFactory {
    public static Payment create(PaymentMethod paymentMethod) throws ClassNotFoundException {
        switch (paymentMethod) {
            case CREDIT_CARD -> {
                return new CreditCardPayment();
            }
            case PAYPAL -> {
                return new PayPalPayment();
            }
            case GOOGLE_PAY -> {
                return new GooglePayPayment();
            }
            case APPLE_PAY -> {
                return new ApplePayPayment();
            }
            default -> throw new ClassNotFoundException(MessageFormat.format(
                    "{0} is not currently supported as a payment method.", paymentMethod
            ));
        }
    }
}
