/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asalsayi;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Asalsayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayi, i, sayac=0;
        Scanner tara= new Scanner(System.in);
        System.out.println("Sayi giriniz");
        sayi=tara.nextInt();
        for(i=2;i<sayi;i++)
        {
            if(sayi%i==0)
            {
                sayac++;
            }
        }
            if(sayac>0)
            {
                System.out.println("Sayi asal degildir. \nsayi="+sayi);
            }
            else 
            {
                System.out.println("Sayi asaldir.\n sayi="+sayi);
            }
        
    }
    
}
