package modelo.botones;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BotonBorrar extends JButton {
    public BotonBorrar(String text, int X, int Y) {
        super(text);
        try {
            InputStream inputStream = new BufferedInputStream(
                    new FileInputStream("C:\\Users\\Administrador\\Desktop\\Fuentes\\Adamant_BG.otf"));

            Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream);

            setFont(font.deriveFont(Font.BOLD, 12f));
            inputStream.close();
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        setBounds(X,Y,70,55);
        setBackground(new Color(186, 116, 213));
    }
}