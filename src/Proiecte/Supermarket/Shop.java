package Proiecte.Supermarket;

import java.io.*;
import java.util.Scanner;

public class Shop {
    Scanner sc = new Scanner(System.in);

    public void writeProducts(Products products) throws FileNotFoundException {

        try (

                FileWriter fw = new FileWriter("C:\\Users\\grizzlyan\\Desktop\\Supermarket.txt", true);
                PrintWriter output = new PrintWriter(fw)
                ) {

            output.print(products.getId() + " ");
            output.print(products.getName() + " ");
            output.print(products.getPrice() + " ");
            output.println(products.getCategory());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readFruits() throws FileNotFoundException {
        System.out.println("Which is the product id?");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Which is the product name?");
        String name = sc.nextLine();
        System.out.println("Which is the product price?");
        int price = sc.nextInt();
        sc. nextLine();
        System.out.println("Which category belongs?");
        String category = sc.nextLine();

        Products fruits = new Products(id, name, price, category);
        writeProducts(fruits);



    }

    public void readProducts(){

        try {
            File inputfile = new File("C:\\Users\\grizzlyan\\Desktop\\Supermarket.txt");
                    Scanner input = new Scanner(inputfile);
            while (input.hasNextLine()) {

                String line = input.nextLine();
                System.out.println("read: " + line);
            }
            input.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
