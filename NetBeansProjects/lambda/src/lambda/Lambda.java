/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author Asus
 */
public class Lambda {

  
        interface lambda{
            int calistir(int x, int y);
        }
        interface lambda2{
            int calistir(int x);
        }
        int gv=100;
        public int f(int x){
            return x*gv;
        } 
    public static void main(String[] args) {
        // TODO code application logic here
        int j=5;
        Lambda le = new Lambda();
        System.out.println(""+ le.f(j));
        lambda l=(x,y)->x*y;
        lambda2 l2=(x)->x*x;
        
        System.out.println(l.calistir(5,6));
        System.out.println(l2.calistir(8));
    }
    
}
