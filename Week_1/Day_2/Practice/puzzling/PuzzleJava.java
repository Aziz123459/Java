import java.util.ArrayList;

import java.util.Random;
 public class PuzzleJava{ 

    
//getTenRolls
//Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.
public  static  ArrayList<Integer> getTenRolls (){  
    
    int n=10;   
    ArrayList<Integer> arrayRandom= new  ArrayList<Integer>();

    for (int i = 0; i < n; i++) {    
        Random randMachine = new Random(); 
        arrayRandom.add(randMachine.nextInt(20));
        
    }    

    return  arrayRandom ;
}  
//getRandomLetter

// Write a method that will:

// Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values).
// Generate a random index between 0-25 and use it to pull a random letter out of the array.
// Return the random lette


 public static char getRandomLetter() { 
            Random randMachine = new Random(); 

        char[] alphabet = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'
        };  
        return  alphabet[randMachine.nextInt(25)];
        

} 
public static String  generatePassword()  {  
    String ch="";
    for (int i = 0; i < 8; i++) {  
        ch = ch + getRandomLetter();
        
    } 
    return ch ;
    
} 

    public ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;

    }
 }