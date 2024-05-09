package paquete1;

import paquete2.SueldoProfesor;

public class Ejecutor {

    public static void main(String[] args) {
        
        SueldoProfesor Profe1 = new SueldoProfesor("Andres", "Cardenas", 1.300, 
                "1170096444");
        
        SueldoProfesor Profe2 = new SueldoProfesor("Sebastian", "Armijos", 
                1.100);
        
        Profe1.calcularSueldoTotal();
        
        Profe2.calcularSueldoTotal();
        
        System.out.printf("%s\n", Profe1);
        
        System.out.printf("%s\n", Profe2);
        
    }
    
}
