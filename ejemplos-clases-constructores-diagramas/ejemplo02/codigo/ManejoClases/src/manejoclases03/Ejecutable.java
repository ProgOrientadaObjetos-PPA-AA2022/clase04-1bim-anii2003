/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        
        Computadora computadoraPersonal1 = new Computadora(16);  // GB      
        Computadora computadoraPersonal2 = new Computadora("Ryzen");        
        Computadora computadoraPersonal3 = new Computadora("AMD",8);        
      
        // Se asigna valores particulares al objeto
        // a través de los métodos establecer
        
        /*String procesador = "Intel";
        double memoria = 8.2; // se asume que está expresada en GB
        computadoraPersonal.establecerTipoProcesador(procesador);
        computadoraPersonal.establecerMemoria(memoria);
        
        // Se presenta valores en pantalla, rescatando los valores
        // que se necesita a través de los métodos obtener del
        // objeto */
        
        // COMPUTADORA 1        
        
        computadoraPersonal1.establecerTipoProcesador("Intel");
        
        System.out.printf("Computadora 1\n"
                + "Procesador: %s\n" 
                + "Memoria: %.2f GB\n", 
                computadoraPersonal1.obtenerTipoProcesador(),
                computadoraPersonal1.obtenerMemoria());
        
        // COMPUTADORA 2        
        
        computadoraPersonal2.establecerMemoria(8.3);        
        
        System.out.printf("Computadora 2\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal2.obtenerTipoProcesador(),
                computadoraPersonal2.obtenerMemoria());
        
        // COMPUTADORA 3
        
        computadoraPersonal3.establecerTipoProcesador("AMD");
        computadoraPersonal3.establecerMemoria(10);        
        
        System.out.printf("Computadora 3\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal3.obtenerTipoProcesador(),
                computadoraPersonal3.obtenerMemoria());      
    }
}
