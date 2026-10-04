/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package app;

import java.util.Scanner;
import java.util.ArrayList;


public class base {

    static Scanner reader = new Scanner(System.in);
     
     

    static void zad_1(){
    System.out.printf("Az sum %s , fak nomer %s na %s ", "asd" , "34234234", "programirane" );
}
    static  void zad_2(){
       
         char ocenka = reader.nextLine().charAt(0);
        switch(ocenka){
            case 'a' , 'A': 
                System.out.println("otlichno");
                break;
            case 'b' , 'B':
                System.out.println("ok");
                break;
            default:
               System.out.println("ok");
               break;

                             
                
    }
    }
    static void zad_3(){
    System.out.print("vuvedete chislo");
   int n = reader.nextInt();
   System.out.println("Числата от 1 до 100, които се делят на " + n + " без остатък са:");
   for(int i =1  ; i  <=100; i++){
       if(n!=0 && i%n == 0 ){
           System.out.println(i);
    }
    }
    }
    static void zad_9(){
         System.out.print("vuvedete chislo");
         int n = reader.nextInt();
         if(n%2== 0 ){
                System.out.println("chetno");
                
         }else{
               System.out.println("nechetno");
         }
         
    }
       
    public static void main(String[] args) {
            zad_9();
          
       }
}
