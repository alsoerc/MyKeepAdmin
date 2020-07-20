package Fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charo
 */
public class Fuentes {
    
    private Font font = null;
    public String quickMedium ="Quicksand-Medium.ttf";
    public String quickRegular ="Quicksand-Regular.ttf";
    public String quicSemiBold ="Quicksand-SemiBold.ttf";
    public String quickBold = "Quicksand-Bold.ttf";
    
    public Font fuente (String fontName, int style, float size) throws FontFormatException{
        try{
            //Se carga la fuente
            InputStream is = getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (IOException ex) {
            System.err.println(fontName +"Not found");
            font = new Font("Arial",Font.PLAIN, 14);
        }
        
        Font tFont = font.deriveFont(style, size);
        return tFont;
    }
}
