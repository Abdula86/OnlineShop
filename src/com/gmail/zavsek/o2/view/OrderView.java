package com.gmail.zavsek.o2.view;

public class OrderView {
    public void printTotalCost(double totalCost) {
        System.out.println("Сумма к оплате: $" + totalCost);
    }

    public void printPaymentStatus(boolean paymentReceived) {
        System.out.println("Оплата получена: " + (paymentReceived ? "Yes" : "No"));
    }
}