package Parte2;

public class FormularioRombo extends javax.swing.JPanel {
    public FormularioRombo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Deleted to keep only the important code
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        int D = Integer.parseInt(txtD.getText());
        int d = Integer.parseInt(txtd.getText());
        int lado = Integer.parseInt(txtLado.getText());
        Rombo rombo = new Rombo(D, d, lado);
        
        txtArea.setText(String.valueOf(rombo.calcularArea()));
        txtPerimetro.setText(String.valueOf(rombo.calcularPerimetro()));
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtArea.setText("");
        txtPerimetro.setText("");
        txtD.setText("");
        txtd.setText("");
        txtLado.setText("");
    }

    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtd;
}