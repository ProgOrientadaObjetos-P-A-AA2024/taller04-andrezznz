package paquete2;

public class ManejoCheques {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
    public ManejoCheques(String nc, String nb, double vch) {
        
        nombreCliente = nc;
        nombreBanco = nb;
        valorCheque = vch;
        
    }
    
    public ManejoCheques(String nc, String nb) {
        
        nombreCliente = nc;
        nombreBanco = nb;
        valorCheque = 38.000;
        
    }
    
    public void establecerNombreCliente(String x) {
        nombreCliente = x;
    }
    
    public void establecerNombreBanco(String a) {
        nombreBanco = a;
    }
    
    public void establecerValorCheque(double a) {
        valorCheque = a;
    }
        
    public void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.00003;
    }
    
    public String obtenerNombreCliente() {
        return nombreCliente;
    }
    
    public String obtenerNombreBanco() {
        return nombreBanco;
    }
    
    public double obtenerValorCheque() {
        return valorCheque;
    }
    
    public double obtenerComisionBanco() {
        return comisionBanco;
    }
        
    @Override
    public String toString() {
        
        String cadena = String.format("COMISION DEL BANCO:\n\n"
                + "Nombre Del Cliente: %s\n"
                + "Nombre Del Banco: %s\n"
                + "Valor Del Cheque: %.3f\n"
                + "Comision Del Banco: %.5f\n",
                 obtenerNombreCliente(), obtenerNombreBanco(),
                 obtenerValorCheque(), obtenerComisionBanco());

        return cadena;
        
    }
    
    
}
