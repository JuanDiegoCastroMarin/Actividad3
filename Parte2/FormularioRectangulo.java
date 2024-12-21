package Parte2;

public class FormularioRectangulo extends javax.swing.JPanel {
    public FormularioRectangulo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Deleted to keep only the important code
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        int altura = Integer.parseInt(txtAltura.getText());
        int base = Integer.parseInt(txtBase.getText());
        Rectangulo rectangulo = new Rectangulo(base, altura);
        
        txtArea.setText(String.valueOf(rectangulo.calcularArea()));
        txtPerimetro.setText(String.valueOf(rectangulo.calcularPerimetro()));
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtArea.setText("");
        txtPerimetro.setText("");
        txtAltura.setText("");
        txtBase.setText("");
    }

    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtPerimetro;
}