/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class question5 {
    public static void main(String[] args) {

    double n = 5;
    System.out.println("n, n^2, n^3, n^4");
    for(int i=1; i<=5; ++i)
    {   
        int a = (int) Math.pow(i, 2);
        int b = (int) Math.pow(i, 3);
        int c = (int) Math.pow(i, 4);
        System.out.println(i + ", " + a + ", " + b + ", " + c);
    
    }
  }
}
