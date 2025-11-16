package com.mhdarslan.Internal.working.of.Spring.Boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}

    /*
    * there are two type of injection
     * 1- Field injection (@Autowired)
     * 2- Constructor Dependency injection (mostly we use this one)
    *  */


    //    private RazorPaymentService paymentService = new RazorPaymentService();

    // now this is a bean so we don't need to make its object
    // 1- Field injection (@Autowired)
//    @Autowired
    private PaymentService paymentService;


    // 2- Constructor Dependency injection
    public InternalWorkingOfSpringBootApplication(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @Override
    public void run(String... args) throws Exception {
        String payment = paymentService.pay();
        System.out.println("Payment done: " + payment);
    }
}
