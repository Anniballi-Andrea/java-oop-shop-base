package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    public Product(String name, String description, BigDecimal price, BigDecimal iva) {
        Random rand = new Random();
        this.code = rand.nextInt(9999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public Product() {
        Random rand = new Random();
        this.code = rand.nextInt(9999);
        this.name = "-";
        this.description = "-";
        this.price = new BigDecimal(0);
        this.iva = new BigDecimal(0);
    }

    public int getCode() {
        return this.code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public BigDecimal getIvaPrice() {
        if (price != null && iva != null) {
            return price.add(price.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public String getFullName() {
        if (name != null) {
            return code + "-" + name;
        }
        return null;
    }
}
