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
public class muhendis extends insan {
    int maas;
    int zam(){
        maas=(int) (maas+(maas*(float)0.1));
        return maas;
    }
    
}
