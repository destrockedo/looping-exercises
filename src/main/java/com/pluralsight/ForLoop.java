package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        //count starts at 10. If count is greater than 0; subtract 1
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Launch");
    }
}
