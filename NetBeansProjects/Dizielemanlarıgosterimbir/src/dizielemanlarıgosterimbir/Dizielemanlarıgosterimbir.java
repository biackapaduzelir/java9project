/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizielemanlarıgosterimbir;

/**
 *
 * @author Asus
 */
public class Dizielemanlarıgosterimbir {

    
    public static void main(String[] args) {
        double[] d=  {2.1, 3.4, 4.6, 1.1, 0.11 };
        String[] s= {"defter", "kalem", "sarman", "tekir", "boncuk"   };
        
        //double tipindeki dizimizi ekrana bastiriyoruz 
        for(int i=0; i<d.length; i++){
            System.out.println("d["+i+"]= " +d[i]);
             }
            //string tipindeki dizimizi ekrana baştırıyoruz.
            for(int i=0; i< s.length; i++ ) {
                System.out.println ("s["+i+"]= "+s[i]);
                
            }
    }
    
}
