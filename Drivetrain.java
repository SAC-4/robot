public class Drivetrain {
    static void function1() {

        System.out.println("drivetrain running");
    }

    static void moving(double a) {

      if (a == 0){
        System.out.print("no");

    
      } else if (a < 0) {
        Math.abs(a);
        System.out.println("Drivetrain has moved backwards " + Math.abs(a) + " metres");

      } else 
        System.out.println("Drivetrain has moved " + a + " metres");
      }
      static void function2() {

        System.out.println ("turning");  

      
      static void turning(double b){
        
        if (b == 0) {
        System.out.print("no turn");

        } else if (b > 360) {
        System.out.println("drivetrain is now at" + (b - 360) + "metres");{

        } else if (b < 0) {
          System.out.println("drivetrain is now at" + b + "degrees"); 
      } else 
      System.out.println("drivetrain is now at" + b + "degrees");
      }
  
      //Make a funtion that quickturns
      //Make a fucntion that returns the current angle of the robot


