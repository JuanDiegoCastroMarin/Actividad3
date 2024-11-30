public class Estudiante
{
    private double patrimonio;
    private int estratoSocial;

    public Estudiante(
        double patrimonio,
        int estratoSocial
    ) {
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    public double obtenerPagoPorMatricula() {
        double pago = 50000;
        if (patrimonio > 2000000 && estratoSocial > 3)
            pago += 0.03 * patrimonio;

        return pago;
    }
}