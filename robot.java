public class robot {
    public static void main(String[] args) {
       
        Drivetrain.function1();
        Drivetrain.moving(-12);
        Drivetrain.function2();
        Drivetrain.turning(370);
        
        Intake intake=new Intake();
        intake.intake1();
        intake.intakeangle();
        intake.intakeangle();
        intake.intakeangle();

       // Intake.intakeon("enable");
       // Intake.rollers("toggleup");
    }
    
}
