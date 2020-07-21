package form;

import Fonts.Fuentes;
import com.placeholder.PlaceHolder;

import java.awt.FontFormatException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import api.ClienteEquipos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import models.Equipo;

public class PnlTiposDeInventario extends javax.swing.JPanel {

    Fuentes tipoDeFuentes;
    private ClienteEquipos api;
    private DefaultTableModel modelo;
    /**
     * Creates new form Panel1
     */
    PlaceHolder holder;

    public PnlTiposDeInventario() throws FontFormatException {
        initComponents();
        modelo = new DefaultTableModel();
        tipoDeFuentes = new Fuentes();
        modelo.setColumnIdentifiers(new Object[]{"ID", "TIPO EQUIPO", "SERIAL", "ESTADO"});
        tablaSolicitudes.setModel(modelo);
        tablaSolicitudes.setFont(tipoDeFuentes.fuente(tipoDeFuentes.quickMedium, 0, 15));
        jLabelSolicitudesPrestamos.setFont(tipoDeFuentes.fuente(tipoDeFuentes.quickBold, 0, 17));
        api = new ClienteEquipos();
        getInventario();
        validarId();
        ocultar();
        buscar();
    }

    public void holders() {

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
        pnlDatosIngresar = new javax.swing.JPanel();
        txtBuscarPorSerialEnLista = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnDelete = new rsbuttom.RSButtonMetro();
        btnListar = new rsbuttom.RSButtonMetro();
        btnEliminar = new rsbuttom.RSButtonMetro();
        btnEditar1 = new rsbuttom.RSButtonMetro();
        txtSerial = new javax.swing.JTextField();
        labelserial = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        labelestado = new javax.swing.JLabel();
        btnActualizar = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();
        labelid1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSolicitudes = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
        jLabelSolicitudesPrestamos.setText("                                                                     Inventario en existencia");
        jLabelSolicitudesPrestamos.setOpaque(true);

        pnlDatosIngresar.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosIngresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarPorSerialEnLista.setBackground(new java.awt.Color(226, 216, 216));
        txtBuscarPorSerialEnLista.setBorder(null);
        pnlDatosIngresar.add(txtBuscarPorSerialEnLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 200, 20));

        label.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        label.setText("Buscar equipo por id");
        pnlDatosIngresar.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 270, -1));
        pnlDatosIngresar.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 92, -1));

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlDatosIngresar.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 90, 26));

        btnListar.setText("Actualizar lista");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        pnlDatosIngresar.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 26));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlDatosIngresar.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 26));

        btnEditar1.setText("Editar");
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });
        pnlDatosIngresar.add(btnEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 26));
        pnlDatosIngresar.add(txtSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 92, -1));

        labelserial.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelserial.setText("SERIAL");
        pnlDatosIngresar.add(labelserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 60, -1));
        pnlDatosIngresar.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 92, -1));

        labelestado.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelestado.setText("ESTADO");
        pnlDatosIngresar.add(labelestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 70, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlDatosIngresar.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 90, 26));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/barraBusqueda.png"))); // NOI18N
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel2KeyTyped(evt);
            }
        });
        pnlDatosIngresar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 280, 60));

        labelid1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelid1.setText("ID");
        pnlDatosIngresar.add(labelid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 50, -1));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tablaSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tipo de Equipo", "Serial", "Entradal"
            }
        ));
        tablaSolicitudes.setRowHeight(25);
        tablaSolicitudes.setRowSelectionAllowed(false);
        tablaSolicitudes.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(tablaSolicitudes);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSolicitudesPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDatosIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSolicitudesPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatosIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtId.getText() != "") {
            if (api.deleteOne(Equipo.class, Integer.parseInt(txtId.getText())) != null) {
                JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
                cleanTable();
                getInventario();
                ocultar();
                txtId.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido");
        }


    }//GEN-LAST:event_btnDeleteActionPerformed


    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        cleanTable();
        getInventario();

    }//GEN-LAST:event_btnListarActionPerformed


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        txtId.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        mostrar();
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (updateEquipo(Integer.parseInt(txtId.getText()), txtEstado.getText(), txtSerial.getText())) {
            JOptionPane.showMessageDialog(null, "Registro actualizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            cleanTable();
            getInventario();
            ocultar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jLabel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2KeyTyped

    private void buscar() {
        txtBuscarPorSerialEnLista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyChar() == ke.VK_ENTER) {
                    cleanTable();
                    getInventarioOne(Integer.parseInt(txtBuscarPorSerialEnLista.getText()));
                }
            }
        });
    }

    private boolean updateEquipo(int id, String estado, String Serial) {
        boolean isValid = false;
        Equipo oneEquipo = getOneEquipo(id);
        oneEquipo.setIdEquipo(id);
        oneEquipo.setEstado(estado);
        oneEquipo.setSerial(Serial.toUpperCase());
        if (api.update(oneEquipo) != "") {
            isValid = true;
        }
        return isValid;
    }

    private Equipo getOneEquipo(int id) {
        return api.getOneByID(Equipo.class, id);
    }

    private void validarId() {
        txtId.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == ke.VK_BACK_SPACE) {
                    txtId.setEditable(true);
                } else {
                    txtId.setEditable(false);
                }
            }
        });
        txtBuscarPorSerialEnLista.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == ke.VK_BACK_SPACE) {
                    txtBuscarPorSerialEnLista.setEditable(true);
                } else {
                    txtBuscarPorSerialEnLista.setEditable(false);
                }
            }
        });
    }

 

    private void ocultar() {
        txtId.setEnabled(false);
        txtEstado.setEnabled(false);
        txtSerial.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    private void mostrar() {
        txtId.setEnabled(true);
        txtEstado.setEnabled(true);
        txtSerial.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnDelete.setEnabled(true);
    }

    private void getInventarioOne(int id) {
        Equipo e = getOneEquipo(id);
        System.out.println(e.getIdEquipo() + " " + setTipoEquipo(e.getIdTipoEquipo()) + " " + e.getSerial() + " " + e.getEstado());
        modelo.addRow(new Object[]{e.getIdEquipo(), setTipoEquipo(e.getIdTipoEquipo()), e.getSerial(), e.getEstado().toUpperCase()});
    }

    private void getInventario() {
        List<Equipo> listaEquipos = api.getAll();
        for (Equipo e : listaEquipos) {
            modelo.addRow(new Object[]{e.getIdEquipo(), setTipoEquipo(e.getIdTipoEquipo()), e.getSerial(), e.getEstado().toUpperCase()});
        }
    }

    private String setTipoEquipo(int tipo) {
        String myTipo = "";
        switch (tipo) {
            case 1:
                myTipo = "PROYECTOR HDMI";
                break;
            case 2:
                myTipo = "PROYECTOR VGA";
                break;
            case 3:
                myTipo = "LAPTOP";
                break;
            case 4:
                myTipo = "BOCINA";
                break;
            case 5:
                myTipo = "AMPLIFICADOR";
                break;
        }
        return myTipo;
    }

    private void cleanTable() {
        txtId.setText("");
        modelo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnActualizar;
    private rsbuttom.RSButtonMetro btnDelete;
    private rsbuttom.RSButtonMetro btnEditar1;
    private rsbuttom.RSButtonMetro btnEliminar;
    private rsbuttom.RSButtonMetro btnListar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSolicitudesPrestamos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelestado;
    private javax.swing.JLabel labelid1;
    private javax.swing.JLabel labelserial;
    private javax.swing.JPanel pnlDatosIngresar;
    private javax.swing.JTable tablaSolicitudes;
    private javax.swing.JTextField txtBuscarPorSerialEnLista;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSerial;
    // End of variables declaration//GEN-END:variables

}
