package view.cajas;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CajaTitulo extends JTextField {
    public CajaTitulo() {
        setBounds(280,3,600,80);
        setBorder(null);
        setFocusable(false);
        setEditable(false);
        setHorizontalAlignment(CajaTitulo.CENTER);
        try {
            InputStream inputStream = new BufferedInputStream(
                    new FileInputStream("C:\\Users\\Administrador\\Desktop\\Repositorio GIT\\src\\view\\fuentes\\panipuri\\Panipuri.otf"));

            Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream);

            setFont(font.deriveFont(Font.BOLD, 52f));
            inputStream.close();
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}
