package com.gmail.zavsek.o2;

import com.gmail.zavsek.o2.controller.OrderController;
import com.gmail.zavsek.o2.product.FixedPriceProduct;
import com.gmail.zavsek.o2.product.Product;
import com.gmail.zavsek.o2.view.OrderView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product fixedPriceProduct = new FixedPriceProduct();

        System.out.print("Введите количество товара: ");
        int quantity = scanner.nextInt();

        System.out.print("Вам нужна доставка? (Yes/No): ");
        boolean deliveryRequired = scanner.next().equalsIgnoreCase("Yes");

        System.out.print("Введите имя получателя: ");
        String recipientName = scanner.next();

        System.out.print("Введите номер телефона получателя: ");
        String recipientPhoneNumber = scanner.next();

        String deliveryAddress = "";
        if (deliveryRequired) {
            System.out.print("Введите адрес доставки: ");
            deliveryAddress = scanner.next();
        }

        OrderController orderController = new OrderController();
        orderController.createOrder(fixedPriceProduct, quantity, deliveryRequired, recipientName, recipientPhoneNumber, deliveryAddress);
        double totalCost = orderController.calculateTotalCost();

        OrderView orderView = new OrderView();
        orderView.printTotalCost(totalCost);

        if (deliveryRequired) {
            orderController.receivePayment();
            orderView.printPaymentStatus(orderController.isPaymentReceived());
        } else {
            orderView.printPaymentStatus(true);
        }
    }
}