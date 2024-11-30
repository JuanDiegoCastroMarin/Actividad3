public class Empleado
{
    private String nombre;
    private double horasTrabajadas;
    private double salarioBasicoPorHora;
    public Empleado(
        String nombre,
        double horasTrabajadas, 
        double salarioBasicoPorHora
    ) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.salarioBasicoPorHora = salarioBasicoPorHora;
    }

    public String obtenerResultado() {
        double salario = horasTrabajadas * salarioBasicoPorHora;
        if (salario > 450000) return "El empleado con nombre " + nombre + " gana " + salario + " pesos al mes";
        else return "El empleado se llama " + nombre;
    }
}