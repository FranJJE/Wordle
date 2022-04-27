package view.paneles;

import view.eventos.EventLetterPressed;
import view.botones.BotonBorrar;
import view.botones.BotonEnviar;
import view.botones.BotonTeclado;

import javax.swing.*;
//495 ANCHO (10 BOTONES X 45 de WIDTH + 9 HUECOS(de 5)) + 185 DE WIDTH + 3 HUECOS(de 10))

public class PanelTeclado extends JPanel {
    private final BotonTeclado[] botones = {new BotonTeclado("Q", 0, 0), new BotonTeclado("W", 55, 0), new BotonTeclado("E", 110, 0), new BotonTeclado("R", 165, 0), new BotonTeclado("T", 220, 0), new BotonTeclado("Y", 275, 0), new BotonTeclado("U", 330, 0), new BotonTeclado("I", 385, 0), new BotonTeclado("O", 440, 0), new BotonTeclado("P", 495, 0)
            , new BotonTeclado("A", 0, 65), new BotonTeclado("S", 55, 65), new BotonTeclado("D", 110, 65), new BotonTeclado("F", 165, 65), new BotonTeclado("G", 220, 65), new BotonTeclado("H", 275, 65), new BotonTeclado("J", 330, 65), new BotonTeclado("K", 385, 65), new BotonTeclado("L", 440, 65), new BotonTeclado("Ñ", 495, 65)
            , new BotonTeclado("Z", 90, 130), new BotonTeclado("X", 145, 130), new BotonTeclado("C", 200, 130), new BotonTeclado("V", 255, 130), new BotonTeclado("B", 310, 130), new BotonTeclado("N", 365, 130), new BotonTeclado("M", 420, 130)};
    private final BotonEnviar enviar = new BotonEnviar("Enviar", 0, 130);
    private final BotonBorrar borrar = new BotonBorrar("Borrar", 475, 130);

    PanelTeclado() {
        super(null);
        setBounds(300, 470, 545, 185);
        for (BotonTeclado a : botones) {
            a.addKeyListener(new EventLetterPressed());
            add(a);
        }
        borrar.addKeyListener(new EventLetterPressed());
        add(enviar);
        add(borrar);
    }

    public BotonTeclado[] getBotones() {
        return botones;
    }

    public BotonBorrar getBorrar() {
        return borrar;
    }

    public BotonEnviar getEnviar() {
        return enviar;
    }
}
