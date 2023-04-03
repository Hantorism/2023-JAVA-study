package practice04;

class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

// Subclass 1
class Car extends Vehicle {
      @Override
      void display() {
        System.out.println("This is a car.");
   }
}

// Subclass 2
class Bike extends Vehicle {
      @Override
      void display() {  
          System.out.println("This is a bike.");
      }
}

// Main class
public class Practice04 {
   public static void main(String[] args) {
         // Create an array of Vehicle type (superclass)
         Vehicle[] vehicles = new Vehicle[3];

        // TO DO 1: Store instances to vehicles array, 0 : Vehicle, 1 : Car, 2 : Bike.


       //

        // TO DO 2: Call the display() method on each element in the array.


        //
   }
}