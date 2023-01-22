public class robot {
    public static void main(String[] args) {
       
        Drivetrain.function1();
        Drivetrain.moving(-12);
        
        Intake intake=new Intake();
        intake.intake1();
        intake.intake1();
        intake.intake1();

       // Intake.intakeon("enable");
       // Intake.rollers("toggleup");
    }
    
}
