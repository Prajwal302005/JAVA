package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int counter = 0;

        boolean exit = false;
        while (!exit) {
            System.out.println("\n0. Exit\n1. Add Mango\n2. Add Orange\n3. Add Apple\n4. Display Names\n5. Display Fresh Fruit Info\n6. Mark Fruit as Stale\n7. Taste of Stale Fruits");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    exit = true;
                    break;

                case 1: 
                    if (counter < basket.length) {
                        System.out.print("Enter name of fruit, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Mango(name, color, weight);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2: 
                    if (counter < basket.length) {
                        System.out.print("Enter name of fruit, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Orange(name, color, weight);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3: 
                    if (counter < basket.length) {
                        System.out.print("Enter name of fruit, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Apple(name, color, weight);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4:
                    for (Fruit f : basket) {
                        if (f != null)
                            System.out.println(f.getName());
                    }
                    break;

                case 5: 
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f);
                            System.out.println("Taste: " + f.taste());
                        }
                    }
                    break;

                case 6: 
                    System.out.print("Enter index to mark stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < basket.length && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Marked as stale.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 7:
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + " Taste: " + f.taste());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        
        sc.close();
    }
}
