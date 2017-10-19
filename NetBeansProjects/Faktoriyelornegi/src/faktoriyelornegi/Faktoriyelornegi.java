/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktoriyelornegi;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Faktoriyelornegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner tara= new Scanner(System.in);
        int x;
        System.out.println("bir sayi giriniz");
        x= tara.nextInt();
        
        int sayac=1;
        int faktoriyel=1;
        do
        {
            faktoriyel=sayac*faktoriyel;
            sayac++;
        }
        while(sayac<=x);
        System.out.println(faktoriyel);
             
    }
    
}
