package view.botones;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BotonEnviar extends JButton {
    public BotonEnviar(String text, int X, int Y) {
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
        setBounds(X,Y,85,55);
        setBackground(new Color(116, 170, 213));
    }
}
