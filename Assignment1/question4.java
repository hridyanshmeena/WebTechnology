/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class question4 {
    public static void main(String[] args) {
    System.out.println("With Temp");
    int a=13;
    int b=7;
    
    System.out.println("Before Swapping");
    System.out.println("Value of a is :" + a);
    System.out.println("Value of b is :" + b);
    int temp = a;
    a = b;
    b = temp;
    
    System.out.println("After Swapping");
    System.out.println("Value of a is :" + a);
    System.out.println("Value of b is :" + b);
    
    System.out.println("Without Temp");
    
    int x = 11;
    int y = 9;

    System.out.println("Before Swapping");
    System.out.println("Value of x is :" + x);
    System.out.println("Value of y is :" + y);

    //add both the numbers and assign it to first
    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("After Swapping");
    System.out.println("Value of x is :" + x);
    System.out.println("Value of y is :" + y);
 }
    
}
