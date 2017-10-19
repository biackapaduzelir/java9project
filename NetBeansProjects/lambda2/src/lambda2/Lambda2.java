/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Asus
 */
public class Lambda2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> intSeq=Arrays.asList(1,2,3);
        intSeq.forEach(x->{
            x+=2;
            System.out.println(x);
        });
    }
    
}
