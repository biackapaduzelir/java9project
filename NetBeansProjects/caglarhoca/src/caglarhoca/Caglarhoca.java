/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caglarhoca;

/**
 *
 * @author Asus
 */
public class Caglarhoca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k=0;
        System.out.println("k:"+(k++));//önce esitle sonra arttır
        System.out.println("k:"+ (++k));//önce arrtır sonra esitle
        System.out.println("k:"+(k--));
        System.out.println("k:"+(--k));
    }
    
}
