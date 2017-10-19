/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders6kodlari;

/**
 *
 * @author Asus
 */
class insan{
    int boy;
}
class ogrenci extends insan implements Cloneable{ //clone u cagirmak icin implements cloneable kullandık

 Object kopyala() throws CloneNotSupportedException { //clone u cagirmak icin ve klonla obje farklı varlıklar
     
     return this.clone();
 }
      ogrenci kopyala2(){
          ogrenci temp= new ogrenci();
          temp.boy= this.boy;
          return temp;
      }
      boolean equals (ogrenci rhs){
          
          /*if(this.boy==rhs.boy){
              return true;
          }
          else{
              return false;
          } */
          //üste if else yerine 
          return this.boy==rhs.boy;
          
      }
}




public class Ders6kodlari {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        insan ali= new insan();
        insan ahmet= ali; // shallow copy(sig kopyalama) yani ali ve ahmet aynı objeyi gosteriyor
        ali.boy=180;
        System.out.println(ahmet.boy);
        if(ali==ahmet){
            System.out.println("Esitler");
        }
        if(ali.equals(ahmet)){//fonksiyon üzerinden esit mi diye bakar.
            System.out.println("Esitler2");
        }
        ogrenci ayse= new ogrenci();
        ayse.boy=160;
        ogrenci fatma=(ogrenci)ayse.kopyala2();//Deep copy(derin kopyalama)
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        fatma.boy=170;
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        ayse.boy=170;
        if(ayse==fatma){
            System.out.println("Esitler3");
        }
        if(ayse.equals(fatma)){
            System.out.println("Esitler4");
        }
    }

}
