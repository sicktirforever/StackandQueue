package Proiecte.Supermarket;

import java.io.FileNotFoundException;

public class Runner {

    public static void main(String[] args) throws FileNotFoundException {


        Shop shop = new Shop();
        for (int i = 1; i<3;  i++) {
          shop.readFruits();
        }

        shop.readProducts();
    }
}
