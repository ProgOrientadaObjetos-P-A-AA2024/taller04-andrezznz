package paquete2;

public class MatriculaVehiculo {

    private String cedula;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    private int anioAntiguedad;
    
    public MatriculaVehiculo(String c, String mv, int af, double v) {
        
        cedula = c;
        marcaVehiculo = mv;
        anioFabricacion = af;
        valorVehiculo = v;
        
    }
    
    public MatriculaVehiculo(String c, String mv, int af) {
        
        cedula = c;
        marcaVehiculo = mv;
        anioFabricacion = af;
        valorVehiculo = 87.000;
        
    }
    
    public void establecerCedula(String x) {
        cedula = x;
    }
    
    public void establecerMarcaVehiculo(String a) {
        marcaVehiculo = a;
    }
    
    public void establecerAnioFabricacion(int a) {
        anioFabricacion = a;
    }
    
    public void establecerValorVehiculo(double a) {
        valorVehiculo = a;
    }
    
    public void calcularAntiguedad() {
        anioAntiguedad = 2024 - anioFabricacion;
    }
    
    public void calcularValorMatricula() {
        valorMatricula = (0.00002 * valorVehiculo) * anioAntiguedad;
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }
    
    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }
    
    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }
    
    public int obtenerAntiguedad() {
        return anioAntiguedad;
    }    
    
    public double obtenerValorMatricula() {
        return valorMatricula;
    } 
    
    @Override
    public String toString() {
        
        String cadena = String.format("VALOR DE LA MATRICULA\n\n"
                + "Cedula: %s\n"
                + "Marca Del Vehiculo: %s\n"
                + "Anio De Fabricacion: %s\n"
                + "Valor Del Vehiculo: %.3f\n"
                + "Anios De Antiguedad: %s\n"
                + "Valor de Matricula: %.5f\n"
        , obtenerCedula(), obtenerMarcaVehiculo()
        , obtenerAnioFabricacion(), obtenerValorVehiculo(), obtenerAntiguedad()
        , obtenerValorMatricula());
        
        return cadena;
        
    }
    
    
}
