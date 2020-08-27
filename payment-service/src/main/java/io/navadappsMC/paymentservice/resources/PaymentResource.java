package io.navadappsMC.paymentservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.navadappsMC.paymentservice.models.Payment;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

	@RequestMapping("/{order_id}")
	public Payment getPayment(@PathVariable("order_id") int order_id) {
		return new Payment(order_id,20.99);
		
	}
}
