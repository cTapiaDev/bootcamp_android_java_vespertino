package clase20.dependencias;

public class MotorGasolina implements IMotor {

    @Override
    public void arrancar() {
        System.out.println("Motor a gasolina encendido");
    }
    
}
