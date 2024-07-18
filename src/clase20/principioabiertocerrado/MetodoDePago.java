package clase20.principioabiertocerrado;

public class MetodoDePago {
    
    private double monto;
    private double recargo;
    
    public MetodoDePago(double monto, double recargo) {
        this.monto = monto;
        this.recargo = recargo;
    }
    
    public void pagar() {
        // Forma base de pagar en efectivo.
    }
    
}
