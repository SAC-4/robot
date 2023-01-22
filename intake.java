public class Intake {
    boolean intakeon = false;
    boolean intakeup = false;

    public void intake1() {
         

        if (intakeon) {
            intakeon = false;
            System.out.println("off");
        } else {
            intakeon = true;
            System.out.println("on");
        }

}
public void intakeangle() {
    
    
    if (intakeup) {
        intakeup = false;
        System.out.println("angle up");
}   else {intakeup = true;
    System.out.println("angle down");   
}
}

}

      // System.out.println("Here");
      // if (I == "enable") {
       // System.out.println("Intake Running");
      // } else
      // System.out.println("Intake disabled");
       

    //static void rollers(String a) {
       // if (a == "toggleup") {
         //   System.out.println("rollers up ");

       // } else 
        //System.out.println("rollers down");

    //Make a functon to toggle the intake on and off
    //Make a function to toggle the angle of the rollers up/down
    

