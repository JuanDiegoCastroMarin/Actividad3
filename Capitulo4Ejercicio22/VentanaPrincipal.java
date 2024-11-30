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
        double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
        double salarioBasico = Double.parseDouble(txtSalarioBasico.getText());

        Empleado empleado = new Empleado(horasTrabajadas, salarioBasico);
        String resultado = empleado.obtenerResultado();

        txtResultado.setText(String.valueOf(resultado));
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtNombre.setText("");
        txtSalarioBasico.setText("");
        txtHorasTrabajadas.setText("");
        txtResultado.setText("");
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
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalarioBasico;
    private javax.swing.JTextField txtHorasTrabajadas;
    private javax.swing.JTextField txtResultado;
}