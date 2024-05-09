package paquete2;

public class SueldoProfesor {

    private String nombreProfesor;
    private String apellidoProfesor;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public SueldoProfesor(String n, String ap, double sb, String c) {
        
        nombreProfesor = n;
        apellidoProfesor = ap;
        sueldoBasico = sb;
        cedula = c;
        
    }
    
    public SueldoProfesor(String n, String ap, double sb) {
        
        nombreProfesor = n;
        apellidoProfesor = ap;
        sueldoBasico = sb;
        cedula = "1180045987";
        
    }
    
    public void establecerNombreProfesor(String x) {
        nombreProfesor = x;
    }
    
    public void establecerApellidoProfesor(String a) {
        apellidoProfesor = a;
    }
    
    public void establecerSueldoBasico(double a) {
        sueldoBasico = a;
    }
    
    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }
    
    public void establecerCedula(String a) {
        cedula = a;
    }
    
    public String obtenerNombreProfesor() {
        return nombreProfesor;
    }
    
    public String obtenerApellidoProfesor() {
        return apellidoProfesor;
    }
    
    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    public String obtenerCedula() {
        return cedula;
    }    
    
    @Override
    public String toString() {
        
        String cadena = String.format("SUELDO DE PROFESORES\n\n"
                + "Nombre del Docente: %s\n"
                + "Apellido del Docente: %s\n"
                + "Sueldo Basico: %.3f\n"
                + "Sueldo Total: %.3f\n"
                + "Cedula: %s\n"
        , obtenerNombreProfesor(), obtenerApellidoProfesor()
        , obtenerSueldoBasico(), obtenerSueldoTotal(), obtenerCedula());
        
        return cadena;
        
    }
}
