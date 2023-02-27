
class carro1 {
    String make;
    String model;
    int yearModel;
    int currentSpeed;

    public void accelerate(){
        currentSpeed += 10;

    }
     
    public void brake (){
        currentSpeed -= 10;
    }

    public void printInformation(){
        System.out.println("What is the make of your car? " + make);
        System.out.println("What is the model of your car? " + model);
        System.out.println("What is the year of your car? " + yearModel);
        System.out.println("How fast is your car going? " + currentSpeed);
        System.out.println("You are going " + currentSpeed + " mph/h");

    }
}

public class consertaCarro1 {
    public static void main (String[] args){
        carro1 myCar = new carro1();
        myCar.make = "Hyundai";
        myCar.model = "HB20 Sedan";
        myCar.yearModel = 2021;
        myCar.currentSpeed = 100;

        myCar.accelerate();
        myCar.brake();
        
        
        myCar.printInformation();
        
    }
        
    
}
