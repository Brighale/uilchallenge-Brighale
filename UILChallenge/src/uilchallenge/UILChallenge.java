/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uilchallenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author rbowlen
 */
public class UILChallenge {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) throws FileNotFoundException {
          // TODO code application logic here
        String numberData;
        
        Scanner scan = new Scanner(new File("numbers.txt"));
        int counter = scan.nextInt();
        int num;
        int num2;
        int a;
        int b;
        
        for(int i = 0; i < counter; i++){
           num = scan.nextInt();
           num2 = scan.nextInt();
            
            if(num > num2){
                a = num;
                b = num2;
                
            }else{
                b = num;
                a = num2;
            }
            System.out.printf("%d ", a + b);
            System.out.printf("%d ", Math.abs(a - b));
            System.out.printf("%d ", a * b);
            System.out.printf("%.2f \n",(double)a / (double)b);
            
          
        
          }
          
           

     }
     
}
