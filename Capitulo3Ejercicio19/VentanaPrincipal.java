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
        int lado = Integer.parseInt(txtLado.getText());
        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(lado);

        double area = trianguloEquilatero.obtenerArea();
        double altura = trianguloEquilatero.obtenerAltura();
        double perimetro = trianguloEquilatero.obtenerPerimetro();
        
        txtArea.setText(String.valueOf(area));
        txtAltura.setText(String.valueOf(altura));
        txtPerimetro.setText(String.valueOf(perimetro));
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtArea.setText("");
        txtPerimetro.setText("");
        txtLado.setText("");
        txtAltura.setText("");
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
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtPerimetro;
}