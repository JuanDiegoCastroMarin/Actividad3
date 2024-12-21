package Parte2;

public class Circulo {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }    
    public double calcularArea() {
        return Math.pow(radio, 2) * Math.PI;
    }    
    public double calcularPerimetro(){
        return 2 * radio * Math.PI;
    }
}