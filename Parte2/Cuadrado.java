package Parte2;

public class Cuadrado {
    int lado;
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    public double calcularPerimetro(){
        return lado * 4;
    }
    
    public double calcularArea(){
        return Math.pow(lado, 2);
    }   
}