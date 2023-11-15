package com.gmail.zavsek.o2.model;

import com.gmail.zavsek.o2.product.Product;

public class Order {
    private Product product;
    private int quantity;
    private boolean deliveryRequired;
    private String recipientName;
    private String recipientPhoneNumber;
    private String deliveryAddress;
    private boolean paymentReceived;

    public Order(Product product, int quantity, boolean deliveryRequired, String recipientName, String recipientPhoneNumber, String deliveryAddress) {
        this.product = product;
        this.quantity = quantity;
        this.deliveryRequired = deliveryRequired;
        this.recipientName = recipientName;
        this.recipientPhoneNumber = recipientPhoneNumber;
        this.deliveryAddress = deliveryAddress;
        this.paymentReceived = false;
    }

    public double calculateTotalCost() {
        double totalCost = product.getPrice() * quantity;

        if (deliveryRequired) {
            totalCost *= 0.5;
        }

        return totalCost;
    }

    public void receivePayment() {
        this.paymentReceived = true;
    }

    public boolean isPaymentReceived() {
        return paymentReceived;
    }
}

