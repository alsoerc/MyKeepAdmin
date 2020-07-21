package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import menu.MenuItem;
import form.CambiaPanel;
import java.awt.FontFormatException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ross
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() throws FontFormatException {
        initComponents();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    private void execute() throws FontFormatException {
        ImageIcon iconPrestamos = new ImageIcon(getClass().getResource("/menu/prestamo.png"));
        ImageIcon iconInventario = new ImageIcon(getClass().getResource("/menu/inventario.png"));
        ImageIcon iconConsulta = new ImageIcon(getClass().getResource("/menu/database.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu.png"));
        ImageIcon iconNext = new ImageIcon(getClass().getResource("/menu/next.png"));
        //  create submenu Prestamos
        MenuItem menuPrestamoUno = new MenuItem(iconSubMenu, "Solicitudes de Préstamos", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CambiaPanel(panelBody, new form.PnlSolicitudes());
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        MenuItem menuPrestamoDos = new MenuItem(iconSubMenu, "Prestamos Activos", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CambiaPanel(panelBody, new form.PnlSolicitudesActivas());
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        MenuItem menuPrestamoTres = new MenuItem(iconSubMenu, "Préstamos Completados", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CambiaPanel(panelBody, new form.PnlSolicitudesCompletadas());
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        MenuItem menuPrestamoCuatro = new MenuItem(iconSubMenu, "Préstamos Cancelados", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CambiaPanel(panelBody, new form.PnlSolicitudesCanceladas());
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        //Submenu  
        MenuItem menuInventarioUno = new MenuItem(iconSubMenu, "Inventario existente", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CambiaPanel(panelBody, new form.PnlTiposDeInventario());
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        MenuItem menuInventarioDos = new MenuItem(iconSubMenu, "Agregar al inventario", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CambiaPanel(panelBody, new form.PnlAddInventario());
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        MenuItem menuConsultaPorCarrera = new MenuItem(iconSubMenu, "Reporte por carrera", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CambiaPanel(panelBody, new form.PnlConsultaCarreras());//java.sql.Date selectedDate = (java.sql.Date) datePicker.getModel().getValue();
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

//        MenuItem menuConsultaPorHorario = new MenuItem(iconSubMenu, "Reporte por horario", new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                try {
//                    new CambiaPanel(panelBody, new form.PnlConsultaFecha());
//                } catch (FontFormatException ex) {
//                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });

        MenuItem menuConsultaPorDia = new MenuItem(iconSubMenu, "Reporte por fecha", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CambiaPanel(panelBody, new form.PnlConsultaFecha());
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
         MenuItem menuConsultaPorTipoEquipo = new MenuItem(iconSubMenu, "Gráfica por equipos", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CambiaPanel(panelBody, new form.PnlConsultaEquipos());
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        MenuItem menuConsultaPorEdificio = new MenuItem(iconSubMenu, "Gráfico por edificios", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CambiaPanel(panelBody, new form.PnlConsultaDos());
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        MenuItem menuEnviarReporte = new MenuItem(iconSubMenu, "Enviar reporte", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CambiaPanel(panelBody, new form.PnlEnviarReporte());
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        

        MenuItem menuPrestamos = new MenuItem(iconPrestamos, "Préstamos", null, menuPrestamoUno, menuPrestamoDos, menuPrestamoTres, menuPrestamoCuatro);
        MenuItem menuInventario = new MenuItem(iconInventario, "Inventario", null, menuInventarioUno, menuInventarioDos);
        MenuItem menuConsultas = new MenuItem(iconConsulta, "Reportes", null, menuConsultaPorCarrera, /*menuConsultaPorHorario*/ menuConsultaPorDia, menuEnviarReporte, menuConsultaPorEdificio, menuConsultaPorTipoEquipo);
        addMenu(menuPrestamos, menuInventario, menuConsultas);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        cerrarSesion = new javax.swing.JLabel();
        minim = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelHeader.setBackground(new java.awt.Color(23, 77, 142));
        panelHeader.setPreferredSize(new java.awt.Dimension(561, 50));

        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/DotsFinal.png"))); // NOI18N
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseClicked(evt);
            }
        });

        minim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/minimi.png"))); // NOI18N
        minim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimMouseClicked(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(962, Short.MAX_VALUE)
                .addComponent(minim)
                .addGap(21, 21, 21)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minim, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelMenu.setBackground(new java.awt.Color(254, 254, 254));
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 384));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1084, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseClicked
        // TODO add your handling code here:
        new InicioSesion().setVisible(true);
        this.dispose();


    }//GEN-LAST:event_cerrarSesionMouseClicked

    private void minimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);

    }//GEN-LAST:event_minimMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrarSesion;
    private javax.swing.JLabel close;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JLabel minim;
    public javax.swing.JPanel panelBody;
    public javax.swing.JPanel panelHeader;
    public javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
