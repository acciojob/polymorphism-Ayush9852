package com.driver;

public class Main {

    public static void main(String[] args) {
        //Task 1 : Create an object of product class
        Product p = new Product();
        
        //Task 2: Store the answers
        int ans = p.product(10,20);
        int ans2 = p.product(10,20,30);
        double ans3 = p.product(10.5,9.7);

        System.out.println(ans +" "+ans1+" "+ans2);
    }


public static class Product {

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
}
