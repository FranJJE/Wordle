package view.botones;

import controller.Controller;
import view.eventos.EventClickSubmit;
import view.paneles.PanelLetra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import static view.paneles.PanelLetra.letrasPanel;

public class BotonEnviar extends JButton {
    public BotonEnviar(String text, int X, int Y) {
        super(text);
        try {
            InputStream inputStream = new BufferedInputStream(
                    new FileInputStream("src\\view\\fuentes\\adamant\\Adamant_BG.otf"));

            Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream);

            setFont(font.deriveFont(Font.BOLD, 12f));
            inputStream.close();
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        setBounds(X, Y, 85, 55);
        setBackground(new Color(116, 170, 213));
        setFocusPainted(false);
        setFocusable(false);
        addActionListener(new EventClickSubmit());

    }
}
