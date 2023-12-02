package com.qspiders.project;

import java.util.Date;

public class Checkout {
    public static void main(String[] args) {
        // Create some sample products
        Product p1 = new Product("Product 1", "Description 1", 10.0, 2);
        Product p2 = new Product("Product 2", "Description 2", 20.0, 3);
        Product p3 = new Product("Product 3", "Description 3", 30.0, 1);

        // Add the products to the shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(p1);
        cart.addItem(p2);
        cart.addItem(p3);

        // Create a user
        User user = new User("username", "password", "email", "address");

        // Create an order
        Order order = new Order(new Date(), "Pending", cart.getItems());

        // Process the payment
        Payment payment = new Payment(new Date(), "Credit Card", cart.getTotalPrice());

        // Print the order and payment details
        System.out.println("Order Details:");
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Total Price: " + order.getTotalPrice());

        System.out.println("Payment Details:");
        System.out.println("Payment Date: " + payment.getPaymentDate());
        System.out.println("Payment Type: "+payment.getPaymentMethod());
        System.out.println("Total Price: "+payment.getAmountPaid());
    }
 }

