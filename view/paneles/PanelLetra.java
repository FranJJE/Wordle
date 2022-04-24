package view.paneles;

import view.cajas.CajaLetra;

import javax.swing.*;
import java.awt.*;

public class PanelLetra extends JPanel {
    private static int columna = 0;
    private static int fila = 0;

    private static final CajaLetra[][] letrasPanel = new CajaLetra[5][5];
    public PanelLetra() {
        for (int i = 0; i < letrasPanel.length; i++) {
            for (int y = 0; y < letrasPanel[0].length; y++) {
                letrasPanel[i][y] = new CajaLetra(y);
            }
        }
        setBounds(420, 100, 300, 300);
        setLayout(new GridLayout(5, 5));
        for (CajaLetra[] a : letrasPanel) {
            for (CajaLetra b : a) {
                add(b);
            }
        }
    }
    public static int getColumna() {
        return columna;
    }
    public static void plusColumna() {
        columna++;
    }
    public static int getFila() {
        return fila;
    }
    public static void plusFila() {
        fila++;
    }
    public static CajaLetra[][] getArrayPaneles() {
        return letrasPanel;
    }
    /*
    private final CajaLetra[] fila1 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private final CajaLetra[] fila2 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private final CajaLetra[] fila3 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private final CajaLetra[] fila4 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private final CajaLetra[] fila5 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
     */
}

