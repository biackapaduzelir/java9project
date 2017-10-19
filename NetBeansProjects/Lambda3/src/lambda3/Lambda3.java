/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda3;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Asus
 */
public class Lambda3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Javada Stream API uygulama
        List<Integer>list=Arrays.asList(1,2,3);
        int sum=list.stream().map(x->x*x).reduce((x,y)->x+y).get();
        System.out.println(sum);
        /* calisma prensibi
        1.+2.karesi=sonuc
        sonuc+3.karesi=sonuc
        1+2^2=5
        5+3^2=14 
        */
    }
    
}
