package com.matthewschuette.javaorders.Services;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "paymentService")
public class PaymentServicesImpl implements PaymentServices {
}
