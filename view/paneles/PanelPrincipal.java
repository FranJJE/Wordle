package view.paneles;

import view.botones.BotonTeclado;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JFrame {
    public JFrame pantalla = new JFrame();

    public PanelPrincipal() {
        pantalla.add(new PanelLetra());
        pantalla.add(new PanelTeclado());
        pantalla.setBackground(Color.white);
        pantalla.setLayout(null);
        pantalla.add(new PanelTeclado());
        pantalla.add(new PanelLetra());
        pantalla.setVisible(true);
        pantalla.setResizable(false);
        pantalla.setLocationRelativeTo(null);
        pantalla.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
