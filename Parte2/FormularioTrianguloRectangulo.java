package Parte2;

public class FormularioTrianguloRectangulo extends javax.swing.JPanel {
    public FormularioTrianguloRectangulo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Deleted to keep only the important code
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        int altura = Integer.parseInt(txtAltura.getText());
        int base = Integer.parseInt(txtBase.getText());
        TrianguloRectangulo trainguloRectangulo = new TrianguloRectangulo(base, altura);
        
        txtArea.setText(String.valueOf(trainguloRectangulo.calcularArea()));
        txtHipotenusa.setText(String.valueOf(trainguloRectangulo.calcularHipotenusa()));
        txtPerimetro.setText(String.valueOf(trainguloRectangulo.calcularPerimetro()));
        txtTipo.setText(trainguloRectangulo.determinarTipoTriangulo());
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtAltura.setText("");
        txtArea.setText("");
        txtBase.setText("");
        txtHipotenusa.setText("");
        txtPerimetro.setText("");
        txtTipo.setText("");
    }

    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtHipotenusa;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtTipo;
}