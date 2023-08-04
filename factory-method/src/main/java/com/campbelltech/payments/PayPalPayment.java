package com.campbelltech.payments;

import com.campbelltech.payments.Payment;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class PayPalPayment implements Payment {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println(MessageFormat.format("Successfully paid ${0} to merchant using PayPal", amount));
    }
}
