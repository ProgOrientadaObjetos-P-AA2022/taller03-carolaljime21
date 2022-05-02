
package Ejecutor;
import terreno.Terreno;

public class Ejecutor {
    
    public static void main(String[] args){
        
        Terreno costoTerreno1 = new Terreno();
        Terreno costoTerreno2 = new Terreno();
           
        costoTerreno1.establecerAncho(150);
        costoTerreno1.establecerLargo(200);
        costoTerreno1.establecerValorMetroCuadrado(30.25);
        costoTerreno1.calcularArea();
        costoTerreno1.calcularCostoTerreno();
        
        costoTerreno2.establecerAncho(350);
        costoTerreno2.establecerLargo(400);
        costoTerreno2.establecerValorMetroCuadrado(45.50);
        costoTerreno2.calcularArea();
        costoTerreno2.calcularCostoTerreno();
        
        System.out.printf("Costo de un terreno 1\n\nAncho: %d\nLargo: %d\n"
        + "Valor por metro cuadrado: %.2f\nArea: %d\nCosto total: %.2f\n",
        + costoTerreno1.obtenerAncho(), costoTerreno1.obtenerLargo(),
        + costoTerreno1.obtenerValorMetroCuadrado(), costoTerreno1.obtenerArea(),
        + costoTerreno1.obtenerCostoTerreno());
        
        System.out.printf("\nCosto de un terreno 2\n\nAncho: %d\nLargo: %d\n"
        + "Valor por metro cuadrado: %.2f\nArea: %d\nCosto total: %.2f\n",
        + costoTerreno2.obtenerAncho(), costoTerreno2.obtenerLargo(),
        + costoTerreno2.obtenerValorMetroCuadrado(), costoTerreno2.obtenerArea(),
        + costoTerreno2.obtenerCostoTerreno());
    }
    
}
