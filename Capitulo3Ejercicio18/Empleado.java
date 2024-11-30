public class Empleado {
    private double horas;
    private double pagoPorHora;
    private double retencion;

    public Empleado(
        double horas,
        double pagoPorHora,
        double retencion
    ) {
        this.horas = horas;
        this.pagoPorHora = pagoPorHora;
        this.retencion = retencion;
    }

    public double calcularSalarioBruto() {
        return (pagoPorHora * horas)
    }

    public double calcularSalarioNeto() {
        return (pagoPorHora * horas) * (1 - (retencion / 100));
    }
}
