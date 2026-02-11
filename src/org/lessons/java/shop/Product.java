package org.lessons.java.shop;

public class Product {
    /*
     * Un prodotto è caratterizzato da:
     * -codice (numero intero)
     * - nome
     * - descrizione
     * - prezzo
     * - iva
     * Usate opportunamente costruttori, attributi ed eventuali altri metodi di
     * “utilità” per fare in modo che:
     * - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero
     * random
     * - il prodotto esponga un metodo per avere il prezzo base
     * - il prodotto esponga un metodo per avere il prezzo comprensivo di iva
     * - il prodotto esponga un metodo per avere il nome esteso, ottenuto
     * concatenando codice-nome
     */
    int productCode;
    String name;
    String description;
    double price;
    int iva;

    public Product(int productCode, String name, String description, double price, int iva) {
        this.productCode = productCode;
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public void basePrice() {
        System.out.println(this.price + " euro");
    }

    public void ivaPrice() {
        double calc = this.price - this.price * this.iva / 100;
        String roundedCalc = String.format("%.2f", calc);

        System.out.println(roundedCalc + " euro");
    }

    public void completedName() {

        System.out.println(this.productCode + this.name);
    }
}
