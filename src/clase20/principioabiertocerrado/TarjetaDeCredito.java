package clase20.principioabiertocerrado;

public class TarjetaDeCredito extends MetodoDePago {
    
    private int numeroTarjeta;

    public TarjetaDeCredito(double monto, double recargo, int numeroTarjeta) {
        super(monto, recargo);
        this.numeroTarjeta = numeroTarjeta;
    }
    
    @Override
    public void pagar() {
        super.pagar();
        // Aplicamos nueva logica de pago para una tarjeta.
    }
    
}
