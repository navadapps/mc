package io.navadappsMC.orderservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.navadappsMC.orderservice.models.Order;

@RestController
@RequestMapping("/orders")
public class OrderResource {
	
	@RequestMapping("/{order_id}")
	public Order getOrderInfo(@PathVariable("order_id") int order_id) {
		return new Order(order_id,"Veggie Pullav");
		
	}

}
