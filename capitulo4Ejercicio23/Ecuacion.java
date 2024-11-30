public class Ecuacion
{
    private int a;
    private int b;
    private int c;
    public Ecuacion(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calcularSoluciones() {
        double sa = (- b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double sb = (- b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        return "Las soluciones son: " + sa + " y " + sb;
    }
}