/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorinsa;
 
class insan {
    int boy;
    int kilo;
    int yas;
    
    public insan(){ //class ile ayni isme sahip return type yok
        //insan classinda herhangi bir obje olusturulunca calisir
        System.out.println("Bir insan objesi olusturuldu");
        yas=1; //ilk kez olusturulan bir objede yas belirtilmemisse direk 1 olarak belirlenir
    }
    public insan(int yas,int kilo,int boy) //polimorfizm. ve bu varsa public insan() olmak zorunda. yani bos parametresiz bir constructor olmalı
    {
        // this(); //public insan()'ı calistirmak için bunu yazarız
        this.yas= yas; //2. public insanda yas calısır
        this.kilo= kilo;
        this.boy=boy;
    }
    
}
/**
 *
 * @author Asus
 */
public class Constructorinsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        insan veli= new insan(20,80,170);
        insan ali= new insan();// default constructor
        // aksi belirtilmedikce her classın bir constructoru olur.
        new insan(); //objedir ama kimse göstermedigi için javada garbic collector tarafından toplanır.
        System.gc(); // garbic collector calısacak
        ali.boy=180;
        ali.kilo=80; //alinin özelliklerini belirtiriz velinin özellikleri 3lü parametrede belirtildi
        
        System.out.println("Alinin Ozellikleri= "+ali.boy+","+ali.kilo);
        System.out.println("Velinin özellikleri= "+veli.boy+","+veli.kilo);
    }
    
}
