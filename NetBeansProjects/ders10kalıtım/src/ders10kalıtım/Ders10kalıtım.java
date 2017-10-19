/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders10kalıtım;

/**
 *
 * @author Asus
 */
public class Ders10kalıtım {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insan ali=new insan();
        muhendis veli=new muhendis();
        tasarimci asli=new tasarimci();
        veli.boy=180;
        System.out.println(veli.boy);
        veli.kilo=90;
        veli.yemek();
        System.out.println(veli.kilo);
        veli.maas=100;
        veli.zam(); 
        System.out.println(veli.maas);
        asli.maas=500;
        asli.mola();
        System.out.println(asli.maas);
        asli.yurume=60;
        System.out.println(asli.yurume);
        
        
    }
    
}
