/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author betatel
 */
public class Quiz {
    
    public static final int ROWS=200;
    public static final int COLUMNS=8;
    
    String money[] = {"0", "100 KM", "200 KM", "300 KM", "500 KM", "1000 KM", "2000 KM", "4000 KM", "8000 KM", "16000 KM", "32000 KM", "64000 KM", "125000 KM", "250000 KM", "500000 KM", "1000000 KM" };
    Scanner inFile;
    String filePath;
    String questions[][];
    int numberOfQuestions;
    
    public Quiz(String filePath, int numberOfQuestions) {
        this.filePath = filePath;
        this.numberOfQuestions=numberOfQuestions;
        
    }
    
    public void loadData() throws IOException
    {
        this.questions=new String[this.numberOfQuestions][COLUMNS];
        FileReader reader=new FileReader(this.filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        int count = 0;
        while((line = bufferedReader.readLine())!= null){
            this.questions[count++] = line.split(";");
        }
    }   
    
    public int getRandomQuestionNumber()
    {
        return (int)(Math.random()*(this.numberOfQuestions - 1)) + 1;
    }
    
    public void startGame()
    {
        int numberOfQuestion = 1;
        while(numberOfQuestion < 16)
        {
           
           int questionIndex = getRandomQuestionNumber()-1;
           System.out.println("FOR THE "+money[numberOfQuestion]+"$");
           printQuestion(questionIndex,numberOfQuestion);
           Scanner keyboard = new Scanner(System.in);
           System.out.println("ANSWER: ");
           int answer = keyboard.nextInt();
                       
                 System.out.println("Correct ansewer is : "+this.questions[questionIndex][6]);
           if(answer != Integer.parseInt(this.questions[questionIndex][7]))
          
          
            
               break;
 
           numberOfQuestion++;
            ;
        }  if(numberOfQuestion <6)
       {
           System.out.println("I'AM SORRY BUT YOUR ANSEWER IS NOT CORRECT");
           System.out.println("---------------------------------------------------");
           System.out.println("---------------------------------------------------");
           
            System.out.println("YOU WON 0KM");
       }
        
          if(numberOfQuestion >= 6 && numberOfQuestion <=9)
       {
           System.out.println("I'AM SORRY BUT YOUR ANSEWER IS NOT CORRECT");
           System.out.println("---------------------------------------------------");
           System.out.println("---------------------------------------------------");
            System.out.println("YOU WON 500KM");
       }
       if(numberOfQuestion > 10 && numberOfQuestion <=15)
       {
           System.out.println("I'AM SORRY BUT YOUR ANSEWER IS NOT CORRECT");
           System.out.println("---------------------------------------------------");
           System.out.println("---------------------------------------------------");
            System.out.println("YOU WON 32000KM");
       }
       if(numberOfQuestion==16)
       {
           System.out.println("---------------------------------------------------");
           System.out.println("---------------------------------------------------");
           
            System.out.println("YOU ARE MILLIONARE");
       }
    }
  
   
    public void printQuestion(int index,int ordinalNumber)
    {
       
        
        System.out.println("---------------------------------------------------");
        System.out.println(ordinalNumber+"."+this.questions[index][1]);
        System.out.println("---------------------------------------------------");
        System.out.println("1."+this.questions[index][2]);
        System.out.println("2."+this.questions[index][3]);
        System.out.println("3."+this.questions[index][4]);
        System.out.println("4."+this.questions[index][5]);
        /*Tacni odgovori
        System.out.println("correct answer"+this.questions[index][7]);
        */
        
    }
    
   
    
}
