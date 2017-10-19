/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3sayininortalamasi;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);
        int x,y,z,ortalama;
        System.out.println("1.sayiyi giriniz:");
        x=tara.nextInt();
        System.out.println("2.sayiyi giriniz:");
        y=tara.nextInt();
        System.out.println("3.sayiyi giriniz");
         z=tara.nextInt();
         
         ortalama= (x*y*z)/3;
         
         System.out.println("Ortalama="+ortalama);
    }
    
}
