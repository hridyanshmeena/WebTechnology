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

    double n = 80000;
    int t = 0;
    while(n<=150000){
        n = n*1.05;
        t = t + 1;
    }
    System.out.println("Years Required is " + t);
  }
}
