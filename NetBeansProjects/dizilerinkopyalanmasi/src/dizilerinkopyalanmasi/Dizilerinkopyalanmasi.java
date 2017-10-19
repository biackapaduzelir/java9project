/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizilerinkopyalanmasi;

/**
 *
 * @author Asus
 */
public class Dizilerinkopyalanmasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ilk dizimiz
        int[] dizi1= {1,2,3,4,};
        //daha genis olan ikinci dizimiz
        int[] dizi2={100,90,78,45,40,30,20,10};
        //kopyalama islemini baslatıyoruz
        // o. indexten dizi1 uzaunluğu kadar kopyalama islemi yap 
        System.arraycopy(dizi1, 0, dizi2, 0, dizi1.length);
        
        for(int i=0; i< dizi2.length ; i++){
            System.out.println("dizi2["+i+"]= "+dizi2[i]);
            
        }
    }
    
}
