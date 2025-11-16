package com.mhdarslan.Internal.working.of.Spring.Boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/* these all the same Annotation (@Component) */
//@Component
//@Service
//@RestController
//@Repository
//@Controller

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
// now this will be control from 'resources/application.properties'
public class StripePaymentService implements PaymentService {
    @Override
    public String pay() {
        String payment = "Stripe payment";
        System.out.println("Payment from: " + payment);
        return payment;
    }
}
