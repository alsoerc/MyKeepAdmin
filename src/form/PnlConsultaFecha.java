package form;

import Fonts.Fuentes;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import datadashboard.DaoApartados;
import datadashboard.DateLabelFormatter;
import datadashboard.HeaderFooterPageEvent;
import java.awt.BorderLayout;
import java.awt.FontFormatException;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ApartadoDetalle;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.*;

public class PnlConsultaFecha extends javax.swing.JPanel {

    Fuentes tipoDeFuentes;
    private DefaultTableModel modelo;
    private DaoApartados data;
    private List<ApartadoDetalle> records;
    private java.util.Date date;
    private java.sql.Date sqlDate;
    private UtilDateModel model = new UtilDateModel();
    private JDatePanelImpl datePanel;
    private JDatePickerImpl datePicker;

    /**
     * Creates new form Panel1
     */
    public PnlConsultaFecha() throws FontFormatException {
        initComponents();

        data = new DaoApartados();
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"ID", "EQUIPO", "ALUMNO", "MATRÍCULA", "CARRERA", "EDIFICIO", "AULA", "GRUPO", "FECHA(a/m/d)", "HORARIO"});
        tipoDeFuentes = new Fuentes();
        jLabelSolicitudesPrestamos.setFont(tipoDeFuentes.fuente(tipoDeFuentes.quickBold, 0, 17));
        tHistorialCarrera.setModel(modelo);
        Properties p = new Properties();
        p.put("text.today", "Hoy");
        p.put("text.month", "Mes");
        p.put("text.year", "Año");
        datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setSize(200, 300);
        panelBotones.add(datePicker);

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
        panelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tHistorialCarrera = new javax.swing.JTable();
        panelBotones = new javax.swing.JPanel();
        btnGenerarPdf = new rsbuttom.RSButtonMetro();
        btnBuscar = new rsbuttom.RSButtonMetro();

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
        jLabelSolicitudesPrestamos.setText("Historial de préstamos por carrera");
        jLabelSolicitudesPrestamos.setOpaque(true);

        panelLista.setBackground(java.awt.Color.white);
        panelLista.setLayout(new java.awt.BorderLayout());

        tHistorialCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tHistorialCarrera);

        panelLista.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelBotones.setBackground(java.awt.Color.white);

        btnGenerarPdf.setText("Generar PDF");
        btnGenerarPdf.setFont(new java.awt.Font("Quicksand-Regular.ttf", 1, 12)); // NOI18N
        btnGenerarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPdfActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setFont(new java.awt.Font("Quicksand-Regular.ttf", 1, 12)); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(542, 542, 542)
                .addComponent(btnGenerarPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
            .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesLayout.createSequentialGroup()
                    .addGap(417, 417, 417)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(450, Short.MAX_VALUE)))
        );

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuscar, btnGenerarPdf});

        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnGenerarPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSolicitudesPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSolicitudesPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPdfActionPerformed
        if (modelo.getRowCount() > 0) {
            try {
                crearPdf();
            } catch (FileNotFoundException | DocumentException ex) {
                Logger.getLogger(PnlConsultaFecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existen registros", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarPdfActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla();
        date = (Date) datePicker.getModel().getValue();
        sqlDate = new java.sql.Date(date.getTime());
        showData(sqlDate);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void showData(java.sql.Date fecha) {
        records = data.getRecordsFecha(fecha);
        System.out.println("Cargando");
        JOptionPane.showMessageDialog(null, "Buscando...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        if (!records.isEmpty()) {
            for (ApartadoDetalle record : records) {
                modelo.addRow(new Object[]{record.getIdApartado(), record.getNombreEquipo(), record.getNombre(),
                    record.getMatricula(), record.getCarrera(), record.getEdificio(), record.getAula(),
                    record.getGrupo(), record.getFecha(), record.getHoraInicio() + "-" + record.getHoraFinal()});
            }
            JOptionPane.showMessageDialog(null, "Registros cargados con éxito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No existen registros", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void crearPdf() throws FileNotFoundException, DocumentException {
        if (!records.isEmpty()) {

            String ruta = "/home/alsorc/Documents/Reportes/reporte_fecha_" + sqlDate + ".pdf";
            Document documento = new Document(PageSize.A4.rotate(), 0, 0, 8, 8);
            java.io.FileOutputStream ficheroPdf = new java.io.FileOutputStream(ruta);
            PdfWriter writer = PdfWriter.getInstance(documento, ficheroPdf);
            documento.open();
            PdfPTable tabla = new PdfPTable(10);
            tabla.setWidths(new int[]{1, 2, 1, 2, 2, 1, 1, 1, 2, 2});
            HeaderFooterPageEvent event = new HeaderFooterPageEvent();
            event.onStartPage(writer, documento);
            writer.setPageEvent(event);

            tabla.addCell("ID");
            tabla.addCell("EQUIPO");
            tabla.addCell("ALUMNO");
            tabla.addCell("MATRÍCULA");
            tabla.addCell("CARRERA");
            tabla.addCell("EDIFICIO");
            tabla.addCell("AULA");
            tabla.addCell("GRUPO");
            tabla.addCell("FECHA(a/m/d)");
            tabla.addCell("HORARIO");
            for (ApartadoDetalle record : records) {
                tabla.addCell(String.valueOf(record.getIdApartado()));
                tabla.addCell(record.getNombreEquipo());
                tabla.addCell(record.getNombre());
                tabla.addCell(record.getMatricula());
                tabla.addCell(record.getCarrera());
                tabla.addCell(record.getEdificio());
                tabla.addCell(record.getAula());
                tabla.addCell(record.getGrupo());
                tabla.addCell(record.getFecha());
                tabla.addCell(record.getHoraInicio() + "-" + record.getHoraFinal());
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado","Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No existen registros para reporte","Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }
    private void limpiarTabla() {
        modelo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnBuscar;
    private rsbuttom.RSButtonMetro btnGenerarPdf;
    private javax.swing.JLabel jLabelSolicitudesPrestamos;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelLista;
    private javax.swing.JTable tHistorialCarrera;
    // End of variables declaration//GEN-END:variables
}
