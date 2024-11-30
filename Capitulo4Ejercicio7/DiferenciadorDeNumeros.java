public class DiferenciadorDeNumeros
{
    private int A;
    private int B;

    public DiferenciadorDeNumeros(int a, int b)
    {
        this.A = a;
        this.B = b;
    }

    public String quienEsMayor() {
        if (A > B) return "A es mayor a B";
        else if (B > A) return "B es mayor a A";
        else return "A y B son iguales";
    }
}