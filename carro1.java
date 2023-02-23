import java.util.Scanner;
 
 
/*
* Objects of car type.
* Properties of make, model, year of model, current speed
* Methods: accelerate, brake, print infomration
*/
 
public class carro1 {
  
    public static void main (String[] args){
 
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the make of your car? ");
        String make = scanner.nextLine();
 
        System.out.println("What is the model of your car? ");
        String model = scanner.nextLine();
 
        System.out.println("What is the year of your car?  ");
        int yearModel = scanner.nextInt();
 
        System.out.println("How fast is your car going? ");
        int currentSpeed = scanner.nextInt();
 
      
 
           accelerate("", currentSpeed);
           
           brake("", currentSpeed);
       
        
        scanner.close();
 
    }
   
    static void accelerate(String carrovamos, int vamosSpeed){
        vamosSpeed += 10;
      System.out.println("You are going " + vamosSpeed + " mph"); 
    }
   
     static void brake(String carrovamos, int vamosSpeed){
        vamosSpeed -= 10;
        System.out.println("You are going " + vamosSpeed + " mph"); 
    }
   
    
}