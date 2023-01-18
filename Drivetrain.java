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

    }

