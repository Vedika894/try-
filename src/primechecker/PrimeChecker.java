/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primechecker;

/**    //slide 43 about lecture about methods 
 * 
 *
 * @author Vedika
 */
public class PrimeChecker {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are:\n");
        print(50);
       
    }
    public static void print(int numberOfPrimes){
        int count=0; //count has not started yet 
        int number =2; 
        final int PRIMES_PER_LINE = 10; 
        
        while(count<numberOfPrimes){
            if(isPrime(number))
            count++;
        
        //printing 
        if(count%PRIMES_PER_LINE==0){
            System.out.printf("%-5d \n",number);
        }else{
            System.out.printf("%-5d", number);
        }
        number++;
    }
    }
    
    public static boolean isPrime(int number){ 
        for(int divisor=2; divisor<=number/2; divisor++){
           
           if(number%divisor==0)
               return false;   
        }
               return true; 
           }
}
