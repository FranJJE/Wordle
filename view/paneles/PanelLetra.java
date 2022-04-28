package view.paneles;

import view.cajas.CajaLetra;

import javax.swing.*;
import java.awt.*;

public class PanelLetra extends JPanel {
    public static int columna = 0;
    public static int fila = 0;

    public static final CajaLetra[][] letrasPanel = new CajaLetra[5][5];
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
    public static void resetColumna() {
        columna = 0;
    }
    public static void borrarTexto() {
        if (columna != 0) {
            columna--;
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
}

