package paquete1;

import paquete2.LibretaNotas;

public class Ejecutor {

    public static void main(String[] args) {
        
        LibretaNotas libreta1 = new LibretaNotas("Andres", 10, 10, 10);
        
        LibretaNotas libreta2 = new LibretaNotas("Sebastian", 10, 10);
        
        libreta1.calcularPromedio();
        
        libreta2.calcularPromedio();
        
        System.out.printf("%s\n", libreta1);
        
        System.out.printf("%s\n", libreta2);
    
    }
    
}
