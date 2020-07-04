/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW1;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author betatel
 */
public class Quiztester {
    
    
    
 public static void main(String []args)
 {
     
     
     System.out.println("WELLCOME TO THE GAME MILLIONAIRE:");

     
     Quiz mil=new Quiz(Quiztester.class.getResource("Millionaire.txt").getPath(),1012);
     try{
         mil.loadData();
         mil.startGame();
         
        
     }catch(Exception e){
        System.out.print(e.getMessage());
     }
     
     }
 }

