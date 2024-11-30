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
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());

        DiferenciadorDeNumeros diferenciador = new DiferenciadorDeNumeros(a, b);
        String resultado = diferenciador.quienEsMayor();

        txtResultado.setText(String.valueOf(resultado));
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtA.setText("");
        txtB.setText("");
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
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtResultado;
}