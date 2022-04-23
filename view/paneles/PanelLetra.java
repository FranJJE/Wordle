package view.paneles;

import view.cajas.CajaLetra;

import javax.swing.*;
import java.awt.*;

public class PanelLetra extends JPanel {
    private final CajaLetra[][] letras = new CajaLetra[5][5];
    /*
    private final CajaLetra[] fila1 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private final CajaLetra[] fila2 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private final CajaLetra[] fila3 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private final CajaLetra[] fila4 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private final CajaLetra[] fila5 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
     */
    public PanelLetra() {
        for (int i = 0; i < letras.length; i++) {
            for (int y = 0; y < letras[0].length; y++) {
                new CajaLetra(y);
            }
        }
        setBounds(420, 100, 300, 300);
        setLayout(new GridLayout(5, 5));
        for (CajaLetra[] a : letras) {
            for (CajaLetra b : a) {
                add(b);
            }
        }
    }
}
