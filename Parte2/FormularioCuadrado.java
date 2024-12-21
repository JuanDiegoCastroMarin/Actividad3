package Parte2;

public class FormularioCuadrado extends javax.swing.JPanel {
    public FormularioCuadrado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Deleted to keep only the important code
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        int lado = Integer.parseInt(txtLado.getText());
        Cuadrado cuadrado = new Cuadrado(lado);
        
        txtArea.setText(String.valueOf(cuadrado.calcularArea()));
        txtPerimetro.setText(String.valueOf(cuadrado.calcularPerimetro()));
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtArea.setText("");
        txtPerimetro.setText("");
        txtLado.setText("");
    }

    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtPerimetro;
}