package form;

import Fonts.Fuentes;
import datadashboard.SendReport;
import java.awt.FontFormatException;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import models.ApartadoDetalle;

public class PnlEnviarReporte extends javax.swing.JPanel {

    Fuentes tipoDeFuentes;

    private List<ApartadoDetalle> records;
    private JFileChooser fc;
    private SendReport sr;
    private String direccionCorreo;

    /**
     * Creates new form Panel1
     */
    public PnlEnviarReporte() throws FontFormatException {
        initComponents();
        txtRuta.setEditable(false);
        tipoDeFuentes = new Fuentes();
        jLabelSolicitudesPrestamos.setFont(tipoDeFuentes.fuente(tipoDeFuentes.quickBold, 0, 17));

        fc = new JFileChooser("/home/alsorc/Documents/Reportes");
        sr = new SendReport();
        //loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelSolicitudesPrestamos = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnBuscarArchivo = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        btnEnviarMail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        cmbCorreo = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(java.awt.Color.white);

        jLabelSolicitudesPrestamos.setBackground(new java.awt.Color(127, 145, 232));
        jLabelSolicitudesPrestamos.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jLabelSolicitudesPrestamos.setForeground(java.awt.Color.white);
        jLabelSolicitudesPrestamos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSolicitudesPrestamos.setText("Enviar reporte a correo electrónico");
        jLabelSolicitudesPrestamos.setOpaque(true);

        panelBotones.setBackground(java.awt.Color.white);

        btnBuscarArchivo.setText("Buscar");
        btnBuscarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArchivoActionPerformed(evt);
            }
        });

        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });

        btnEnviarMail.setText("Enviar");
        btnEnviarMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMailActionPerformed(evt);
            }
        });

        jLabel1.setText("Dirección de correo destino");

        jLabel2.setText("Selecciona reporte a enviar");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        cmbCorreo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@outlook.mx", "@outlook.es", "@yahoo.com" }));
        cmbCorreo.setToolTipText("Indique el tipo de correo de destino");

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnEnviarMail, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBotonesLayout.createSequentialGroup()
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBotonesLayout.createSequentialGroup()
                                .addComponent(btnBuscarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel2)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarArchivo)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnEnviarMail)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSolicitudesPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSolicitudesPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArchivoActionPerformed
        int seleccion = fc.showOpenDialog(jPanel2);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //Seleccionamos el fichero
            File fichero = fc.getSelectedFile();

            //Ecribe la ruta del fichero seleccionado en el campo de texto
            txtRuta.setText(fichero.getAbsolutePath());
        }
    }//GEN-LAST:event_btnBuscarArchivoActionPerformed

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaActionPerformed

    private void btnEnviarMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMailActionPerformed
        if (!"".equals(txtRuta.getText())) {
            if (validarCorreo(txtCorreo.getText())) {
                try {
                    sr.sendPdf(txtCorreo.getText() + cmbCorreo.getSelectedItem(), txtRuta.getText());
                    JOptionPane.showMessageDialog(null, "Correo enviado con éxito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } catch (MessagingException ex) {
                    Logger.getLogger(PnlEnviarReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Correo no válido", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ruta no válida", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEnviarMailActionPerformed

    private boolean validarCorreo(String correo) {
        boolean isValid = true;
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i) == '@') {
                isValid = false;
            }
        }
        return isValid;
    }

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

//    private void loadData() {
//        System.out.println("Mostrando...");
//        DefaultCategoryDataset data = new DefaultCategoryDataset();
//
//        final String C1 = "Contaduría";
//        final String C2 = "Administración";
//
//        data.addValue(100, C1, "periodo a evaluar");
//        data.addValue(50, C2, "periodo a evaluar");
//
//        JFreeChart grafica = ChartFactory.createBarChart3D("DUMMY TITTLE", "Carreras", "Cantidad", data, PlotOrientation.VERTICAL, true, true, false);
//        ChartPanel contenedor = new ChartPanel(grafica);
//        panelLista.add(contenedor, BorderLayout.CENTER);
//        panelLista.validate();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarArchivo;
    private javax.swing.JButton btnEnviarMail;
    private javax.swing.JComboBox<String> cmbCorreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSolicitudesPrestamos;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
