
package Ejecutor;
import terreno.Terreno;

public class Ejecutor {
    
    public static void main(String[] args){
        
        Terreno costoTerreno = new Terreno();
        
        int ancho = 150;
        int largo = 200;
        double valorMetroCuadrado = 30.25;
        
        costoTerreno.establecerAncho(ancho);
        costoTerreno.establecerLargo(largo);
        costoTerreno.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        costoTerreno.calcularArea();
        costoTerreno.calcularCostoTerreno();
        
        System.out.printf("Costo de un terreno\n\n Ancho: %d\n Largo: %d\n"
        + " Valor por metro cuadrado: %.2f\n Area: %d\n Costo total: %.2f",
        + costoTerreno.obtenerAncho(), costoTerreno.obtenerLargo(),
        + costoTerreno.obtenerValorMetroCuadrado(), costoTerreno.obtenerArea(),
        + costoTerreno.obtenerCostoTerreno());
    }
    
}
