/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapsullemesoyutlama;

/**
 *
 * @author Asus
 */
public class sekreter extends calısan {
    private int sayac=0;
    int yas;
    public int getSayac(){
        return sayac;
    }
    public void setSayac(int x){
        sayac=x;
    }
    public int getYas(){
        return yas;
    }
    public void setYas(int yas){
        if(yas>0&&yas<150)
        {
            this.yas=yas;
        }
        
    }
    public void maas(){
        System.out.println("Maas=100");
        System.out.println(sayac);
   
        
}
    public final void yetki(){
        System.out.println("Yetkimi kimseye devretmem");
    }
    public static void main (String[] args){
        sekreter ayse= new sekreter();
        sekreter ali= new sekreter();
        sekreter sisko= new sekreter();
        
            
        
        //System.out.println(sayac); static int sayac=0; olunca
        System.out.println(ali.getSayac());
    }
}

