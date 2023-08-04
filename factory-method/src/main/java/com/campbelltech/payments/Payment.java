package com.campbelltech.payments;

import java.math.BigDecimal;

public interface Payment {
    void pay(BigDecimal amount);
}
