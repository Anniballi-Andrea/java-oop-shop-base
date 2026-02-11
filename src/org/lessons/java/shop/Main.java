package org.lessons.java.shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random code = new Random();
        int max = 99999;
        Product tazza = new Product(code.nextInt(max), "capymug", "Una tazza a forma di capybara", 20.99D, 22);

        tazza.basePrice();
        tazza.ivaPrice();
        tazza.completedName();
    }
}
