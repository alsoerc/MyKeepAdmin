package form;

import form.CambiaPanel;
import Main.Main;
import java.awt.Window;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import api.ClienteEquipos;
import models.Equipo;

/**
 *
 * @author ross
 */
public class PnlAddProyector extends javax.swing.JPanel {

    private Equipo equipo;
    private ClienteEquipos api;

    /**
     * Creación de nuevo panel
     */
    public PnlAddProyector() {
        initComponents();
        equipo = new Equipo();
        api = new ClienteEquipos();
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new rsbuttom.RSButtonMetro();
        rSButtonMetro2 = new rsbuttom.RSButtonMetro();
        txtfieldSerie = new javax.swing.JTextField();
        comboBoxTipo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(246, 246, 246));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/add.png"))); // NOI18N
        jLabel1.setText("Agregar Proyector");
        jLabel1.setIconTextGap(10);

        jLabel2.setFont(new java.awt.Font("Roboto Lt", 1, 15)); // NOI18N
        jLabel2.setText("Detalles del Dispositivo");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/pro64.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jLabel4.setText("Número de Serie");

        jLabel6.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jLabel6.setText("Entrada");

        btnCancelar.setText("Cancelar");
        btnCancelar.setColorNormal(new java.awt.Color(116, 210, 129));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        rSButtonMetro2.setText("Agregar");
        rSButtonMetro2.setColorNormal(new java.awt.Color(116, 210, 129));
        rSButtonMetro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro2ActionPerformed(evt);
            }
        });

        comboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HDMI", "VGA" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(txtfieldSerie)
                            .addComponent(comboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(317, 317, 317)
                    .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(326, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(407, Short.MAX_VALUE)
                    .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(91, 91, 91)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Window pnl = SwingUtilities.getWindowAncestor(PnlAddProyector.this);
        pnl.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rSButtonMetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro2ActionPerformed
        if (!"".equals(txtfieldSerie.getText())) {
            if (comboBoxTipo.getSelectedIndex() == 0) {
                equipo.setIdTipoEquipo(1);
            } else {
                equipo.setIdTipoEquipo(2);
            }
            equipo.setIdEquipo(getLastId());
            equipo.setSerial(txtfieldSerie.getText().toUpperCase());
            if (api.insert(equipo) != null) {
                JOptionPane.showMessageDialog(null, "Agregado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe incluir un serial");
        }

    }//GEN-LAST:event_rSButtonMetro2ActionPerformed

    private int getLastId() {
        int id = 0;
        List<Equipo> all = api.getAll();
        for (Equipo equipo1 : all) {
            if (id < equipo1.getIdEquipo()) {
                id = equipo1.getIdEquipo();
            }
        }
        id++;
        return id;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnCancelar;
    private javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    private javax.swing.JTextField txtfieldSerie;
    // End of variables declaration//GEN-END:variables
}
