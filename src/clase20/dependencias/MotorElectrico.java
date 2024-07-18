package clase20.dependencias;

public class MotorElectrico implements IMotor {

    @Override
    public void arrancar() {
        System.out.println("Motor electrico encendido");
    }
    
}
