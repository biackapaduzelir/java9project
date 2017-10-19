/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekmiciftmi;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Tekmiciftmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner tara= new Scanner(System.in);
        int x,sonuc=0;
        
        System.out.println("Bir sayi giriniz:");
        x=tara.nextInt();
        sonuc=x%2;
        if(sonuc==0){
            System.out.println("Sayimiz çifttir=x");
       } else {
            System.out.println("Sayimiz tektir");
        }
            
        }
    }
    

