package Parte2;

public class Trapecio {
    int a;
    int b;
    int c;
    int d;
    int h;
    
    public Trapecio(int a, int b, int c, int d, int h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }
    
    public double calcularArea(){
        return (d + b) * h / 2;
    }
    
    public double calcularPerimetro(){
        return c + b + a + c;
    }
}