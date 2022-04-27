package view.botones;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BotonTeclado extends JButton {
    public BotonTeclado(String text, int X, int Y) {
        super(text);
        setFocusPainted(false);
        try {
            InputStream inputStream = new BufferedInputStream(
                    new FileInputStream("C:\\Users\\Administrador\\Desktop\\Fuentes\\Adamant_BG.otf"));

            Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream);

            setFont(font.deriveFont(Font.BOLD, 16f));
            inputStream.close();
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        setBorder(null);
        setBounds(X, Y, 50, 55);
        setBackground(new Color(156, 169, 173));
    }
}
