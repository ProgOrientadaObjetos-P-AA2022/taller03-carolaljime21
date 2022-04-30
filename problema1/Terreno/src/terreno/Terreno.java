
package terreno;


public class Terreno {

    private int ancho;
    private int largo;
    private int area;
    private double valorMetroCuadrado;
    private double costo_terreno;
    
    public void establecerAncho(int x){
        ancho = x;
    }
    
    public void establecerLargo(int x){
        largo = x;
    }
    
    public void calcularArea(){
        area = ancho * largo;
    }
    
    public void establecerValorMetroCuadrado(double x){
        valorMetroCuadrado = x;
    }
    
    public void calcularCostoTerreno(){
        costo_terreno = valorMetroCuadrado * area;
    }
    
    public int obtenerAncho(){
        return ancho;
    }
    
    public int obtenerLargo(){
        return largo;
    }
    
    public int obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    public double obtenerCostoTerreno(){
        return costo_terreno;
    }
    
}
