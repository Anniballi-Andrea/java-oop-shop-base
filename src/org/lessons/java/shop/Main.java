package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        Product tazza = new Product("CapyMug", "tazza a forma di capybara",
                new BigDecimal(21.99).setScale(2, RoundingMode.CEILING),
                new BigDecimal(0.22).setScale(2, RoundingMode.HALF_DOWN));
        Product matita = new Product();

        System.out.println("queste sono le informazioni della tazza:");
        System.out.println(tazza.getFullName());
        System.out.println(tazza.getPrice());
        System.out.println(tazza.getIvaPrice());
        System.out.println(tazza.getCode());

        System.out.println("queste sono le informazioni della matita:");
        System.out.println(matita.getName());
        System.out.println(matita.getDescription());
        System.out.println(matita.getPrice());

    }
}
