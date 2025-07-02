package tester;

import java.util.Scanner;
import geometry.Point2D;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many points do you want to enter? ");
        int size = sc.nextInt();
        
        Point2D[] points = new Point2D[size];	

        // Accept coordinates
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x and y for point " + i + ": ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            points[i] = new Point2D(x, y);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Calculate distance between 2 points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Show specific point
                    System.out.print("Enter index of point: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < points.length) {
                        System.out.println(points[index].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!!!!");
                    }
                    break;

                case 2: // Show all points
                    for (Point2D p : points) {
                        System.out.println(p.getDetails());
                    }
                    break;

                case 3: // Distance between 2 points
                    System.out.print("Enter index of start point: ");
                    int idx1 = sc.nextInt();
                    System.out.print("Enter index of end point: ");
                    int idx2 = sc.nextInt();

                    if (idx1 >= 0 && idx1 < points.length && idx2 >= 0 && idx2 < points.length) {
                        if (!points[idx1].isEqual(points[idx2])) {
                            double dist = points[idx1].calculateDistance(points[idx2]);
                            System.out.println("Distance: " + dist);
                        } else {
                            System.out.println("Both points are at the same location.");
                        }
                    } else {
                        System.out.println("Invalid indices! Please retry.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
