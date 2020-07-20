

package form;

/**
 *
 * @author ross
 */
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

public class CambiaPanel {
    //
    private JPanel container;
    private JPanel content;


    /**
     * Constructor de clase
     */
    public CambiaPanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }

    CambiaPanel(PnlAddAmplificador pnl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    CambiaPanel(JPanel panelBody) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CambiaPanel(JDesktopPane deskBody, PnlSolicitudesActivas pnlSolicitudesActivas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}//--> fin clase
