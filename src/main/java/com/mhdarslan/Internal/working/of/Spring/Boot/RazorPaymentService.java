package com.mhdarslan.Internal.working.of.Spring.Boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


// to make something as bean, we need to use @Component annotation
@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay")
// now this will be control from 'resources/application.properties'
public class RazorPaymentService implements PaymentService {

    @Override
    public String pay(){
        String payment = "Razor payment";
        System.out.println("Payment from: " + payment);
        return payment;
    }
}
