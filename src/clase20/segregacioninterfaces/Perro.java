package clase20.segregacioninterfaces;

public class Perro implements ICorrer, ISaltar, IEmitirSonido {

    @Override
    public void correr() {
    }

    @Override
    public void saltar() {
    }

    @Override
    public void emitirSonido() {
        System.out.println("GUAU GUAU!!");
    }
    
}
