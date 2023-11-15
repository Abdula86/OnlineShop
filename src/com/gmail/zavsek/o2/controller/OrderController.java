package com.gmail.zavsek.o2.controller;

import com.gmail.zavsek.o2.model.Order;
import com.gmail.zavsek.o2.product.Product;

public class OrderController {
    private Order order;

    public void createOrder(Product product, int quantity, boolean deliveryRequired,
                            String recipientName, String recipientPhoneNumber, String deliveryAddress) {
        order = new Order(product, quantity, deliveryRequired, recipientName, recipientPhoneNumber, deliveryAddress);
    }

    public double calculateTotalCost() {
        if (order != null) {
            return order.calculateTotalCost();
        } else {
            System.out.println("Заказ еще не создан.");
            return 0.0;
        }
    }

    public void receivePayment() {
        if (order != null) {
            order.receivePayment();
        }
    }

    public boolean isPaymentReceived() {
        return order != null && order.isPaymentReceived();
    }
}
