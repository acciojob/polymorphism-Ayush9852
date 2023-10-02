package com.driver;

public class Main {

    public static void main(String[] args) {
        // Task 2: Create an object of the Product class
        Product p = new Product();

        // Task 3: Call the method product(int x, int y) from the Product class object p
        int result1 = p.product(5, 10);
        System.out.println("Result of product(int x, int y): " + result1);

        // Task 4: Call the overloaded method product(int x, int y, int z) from the Product class object p
        int result2 = p.product(5, 10, 2);
        System.out.println("Result of product(int x, int y, int z): " + result2);

        // Task 5: Call the overloaded method product(double x, double y) from the Product class object p
        double result3 = p.product(5.5, 3.0);
        System.out.println("Result of product(double x, double y): " + result3);
    }
}

class Product {

    // Task 3: Create a method with the signature public int product(int x, int y)
    public int product(int x, int y) {
        return x * y;
    }

    // Task 4: Create an overloaded method with the signature public int product(int x, int y, int z)
    public int product(int x, int y, int z) {
        return x * y * z;
    }

    // Task 5: Create an overloaded method with the signature public double product(double x, double y)
    public double product(double x, double y) {
        return x * y;
    }
}
