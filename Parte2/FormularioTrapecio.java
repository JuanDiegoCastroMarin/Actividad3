package Parte2;

public class FormularioTrapecio extends javax.swing.JPanel {
    public FormularioTrapecio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Deleted to keep only the important code
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        int c = Integer.parseInt(txtC.getText());
        int d = Integer.parseInt(txtD.getText());
        int h = Integer.parseInt(txtH.getText());
        Trapecio trapecio = new Trapecio(a, b, c, d, h);
        
        txtArea.setText(String.valueOf(trapecio.calcularArea()));
        txtPerimetro.setText(String.valueOf(trapecio.calcularPerimetro()));
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtArea.setText("");
        txtPerimetro.setText("");
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtD.setText("");
        txtH.setText("");
    }

    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtH;
    private javax.swing.JTextField txtPerimetro;
}