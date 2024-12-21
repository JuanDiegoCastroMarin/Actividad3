package Parte2;

public class FormularioCirculo extends javax.swing.JPanel {
    public FormularioCirculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Deleted to keep only the important code
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        String radio = txtRadio.getText();
        Circulo circulo = new Circulo(Integer.parseInt(radio));
        
        txtArea.setText(String.valueOf(circulo.calcularArea()));
        txtPerimetro.setText(String.valueOf(circulo.calcularPerimetro()));
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtArea.setText("");
        txtPerimetro.setText("");
        txtRadio.setText("");
    }

    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtRadio;
}