package Parte2;

public class Rombo {
    int D;
    int d;
    int lado;
    
    public Rombo(int D, int d, int lado){
        this.D = D;
        this.d = d;
        this.lado = lado;
    }
    
    public double calcularArea(){
        return (D * d) / 2;
    }
    
    public double calcularPerimetro(){
        return lado * 4;
    }
}