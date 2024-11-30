public class TrianguloEquilatero {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double obtenerPerimetro() {
        return 3 * lado;
    }

    public double obtenerAltura() {
        return (Math.sqrt(3) / 2) * lado;
    }

    public double obtenerArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }
}
