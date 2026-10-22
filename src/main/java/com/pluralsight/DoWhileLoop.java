package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {
        String java = "I love Java";
        int count = 0;

        do {
            count++;
            System.out.println(java);
        } while (count < 5);
    }
}