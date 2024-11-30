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
        String numeroInscripcion = txtNumeroInscripcion.getText();
        String nombres = txtNombres.getText();
        double patrimonio = Double.parseDouble(txtPatrimonio.getText());
        int estratoSocial = Integer.parseInt(txtEstratoSocial.getText());

        Estudiante estudiante = new Estudiante(patrimonio, estratoSocial);
        double resultado = estudiante.obtenerPagoPorMatricula();

        txtPagoMatricula.setText(String.valueOf(resultado));
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtNumeroInscripcion.setText("");
        txtNombres.setText("");
        txtPatrimonio.setText("");
        txtEstratoSocial.setText("");
        txtPagoMatricula.setText("");
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
    private javax.swing.JTextField txtNumeroInscripcion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPatrimonio;
    private javax.swing.JTextField txtEstratoSocial;
    private javax.swing.JTextField txtPagoMatricula;
}