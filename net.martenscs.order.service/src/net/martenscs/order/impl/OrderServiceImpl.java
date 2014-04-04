package net.martenscs.order.impl;

import net.martenscs.order.OrderService;

public class OrderServiceImpl implements OrderService {

	public void start() {
		System.out.println("Order Service registered");
	}

	public void stop() {
		System.out.println("Order Service stopped");
	}

	public void processOrder() {
		System.out.println("Order id: ORD123");
	}
}
