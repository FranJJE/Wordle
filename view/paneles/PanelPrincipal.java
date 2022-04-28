package view.paneles;

import view.botones.BotonTeclado;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JFrame {
    public JFrame pantalla = new JFrame();
    public static PanelLetra letras = new PanelLetra();
    public static PanelTeclado teclado = new PanelTeclado();

    public PanelPrincipal() {
        pantalla.add(new PanelTeclado());
        pantalla.add(new PanelLetra());
        pantalla.setBackground(Color.white);
        pantalla.setLayout(null);
        pantalla.add(teclado);
        pantalla.add(letras);
        pantalla.setVisible(true);
        pantalla.setResizable(false);
        pantalla.setBounds(0, 0,1200,700);
        pantalla.setLocationRelativeTo(null);
        pantalla.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static PanelLetra getPanel() {
        return letras;
    }
}
