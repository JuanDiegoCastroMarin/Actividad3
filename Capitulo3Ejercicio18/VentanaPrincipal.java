package igu;

/**
 *
 * @author Juan Castro
 */
public class VentanaPrincipal extends javax.swing.JPanel {
    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Here goes the components declaration. Removed them to keep what matters only
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre = txtNombre.getText();
        String codigo = txtCodigo.getText();
        double horas = Double.parseDouble(txtHoras.getText());
        double pagoPorHora = Double.parseDouble(txtPagoPorHora.getText());
        double retencion = Double.parseDouble(txtRetencion.getText());

        Empleado empleado = new Empleado(horas, pagoPorHora, retencion);
        double salarioBruto = empleado.calcularSalarioBruto();
        double salarioNeto = empleado.calcularSalarioNeto();

        txtSalarioBruto.setText(String.valueOf(salarioBruto));
        txtSalarioNeto.setText(String.valueOf(salarioNeto));
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtNombre.setText("");
        txtCodigo.setText("");
        txtHoras.setText("");
        txtPagoPorHora.setText("");
        txtRetencion.setText("");
        txtSalarioBruto.setText("");
        txtSalarioNeto.setText("");
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtPagoPorHora;
    private javax.swing.JTextField txtRetencion;
    private javax.swing.JTextField txtSalarioBruto;
    private javax.swing.JTextField txtSalarioNeto;
}