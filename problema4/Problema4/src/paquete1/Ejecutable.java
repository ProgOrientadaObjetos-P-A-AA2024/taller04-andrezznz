package paquete1;

import paquete2.ManejoCheques;

public class Ejecutable {

    public static void main(String[] args) {
        
        ManejoCheques cheque1 = new ManejoCheques("Andres", "Banco De Pichincha"
                , 25.300);
        
        ManejoCheques cheque2 = new ManejoCheques("Sebastian", "Banco De Loja");
        
        cheque1.calcularComisionBanco();
        
        cheque2.calcularComisionBanco();
        
        System.out.printf("%s\n", cheque1);
        
        System.out.printf("%s\n", cheque2);
        
    }
    
}
