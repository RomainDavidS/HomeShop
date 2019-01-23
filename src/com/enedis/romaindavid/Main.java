package com.enedis.romaindavid;

import com.enedis.romaindavid.garage.Bike;
import com.enedis.romaindavid.garage.Vehicle;
import com.enedis.romaindavid.homeshop.*;
import com.enedis.romaindavid.lyon.Bus;
import com.enedis.romaindavid.lyon.Lyonnais;
import com.enedis.romaindavid.lyon.MoyenDeLocomotion;
import com.enedis.romaindavid.lyon.Taxi;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       /* Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(customer);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

        Vehicle v = new Bike() ;
        */
       /*
        Lyonnais romaind = new Lyonnais();
        Bus bus = new Bus();
        romaind.seDeplacer( bus );

        Taxi taxi = new Taxi();
        romaind.seDeplacer( taxi );
        MoyenDeLocomotion taxi2 = new Taxi();
        romaind.seDeplacer(taxi2);
        */
        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(customer, new RelayDelivery(27));
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

        bill.generate(new FileWriter("Facture de juste leblanc"));





    }
}
