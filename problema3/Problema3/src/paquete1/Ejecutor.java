package paquete1;

import paquete2.MatriculaVehiculo;

public class Ejecutor {

    public static void main(String[] args) {
        
        MatriculaVehiculo vehiculo1 = new MatriculaVehiculo("1170096444", "Lexus",
                2019, 45.500);

        vehiculo1.calcularAntiguedad();
        vehiculo1.calcularValorMatricula();

        MatriculaVehiculo vehiculo2 = new MatriculaVehiculo("1180045987", "Bentley",
                2015);

        vehiculo2.calcularAntiguedad();
        vehiculo2.calcularValorMatricula();

        System.out.printf("%s\n", vehiculo1);

        System.out.printf("%s\n", vehiculo2);

        
    }
    
}
