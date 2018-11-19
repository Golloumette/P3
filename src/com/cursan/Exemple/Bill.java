package com.cursan.Exemple;

import com.cursan.homeshop.*;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Client client;
    private Map<Product, Integer> products = new HashMap<Product,Integer>();
    private Delivery delivery;

    public Bill(Client client, Delivery delivery) {
        this.client = client;
        this.delivery = delivery;
    }

    /**
     * Add a product witch a quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */
    public void addProduct(Product product,Integer quantity){
        this.products.put(product,quantity);
    }

    public Client getClient() {
        return client;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public static class Main {

        public static void main (String[] args){
            Product cafe = new Product( "Philips HD7866/66","Philips Senseo Quadrante, Noir - 1 ou 2 tasses",79.99);
            Product tv = new Television("TV Samsung UE49MU6292","Smart TV LED incurvée49\"",599,49,"LED");
            Fridge fridge = new Fridge("BEKO TSE 1042 F","Réfrégirateur BEKO 130L - Classe A+ - blanc",189,130,false);

            Customer customer = new Customer("Juste Leblanc","19 rue Germain Pilon,Paris");

            Bill bill = new Bill(client);

            bill.addProduct(cafe,1);
            bill.addProduct(tv,1);
            bill.addProduct(fridge,1);


        }


    }
}
