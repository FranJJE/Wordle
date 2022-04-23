package view.paneles;

import modelo.cajas.CajaLetra;

import javax.swing.*;
import java.awt.*;

public class PanelLetra extends JPanel {
    private CajaLetra[] fila1 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private CajaLetra[] fila2 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private CajaLetra[] fila3 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private CajaLetra[] fila4 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};
    private CajaLetra[] fila5 = {new CajaLetra(0), new CajaLetra(1), new CajaLetra(2), new CajaLetra(3), new CajaLetra(4)};

    public PanelLetra() {
        setBounds(420,100,300,300);
        setLayout(new GridLayout(5,5));
        for (CajaLetra a : fila1) {
            add(a);
        }
        for (CajaLetra b : fila2) {
            add(b);
        }
        for(CajaLetra c : fila3) {
            add(c);
        }
        for(CajaLetra d : fila4) {
            add(d);
        }
        for(CajaLetra e : fila5) {
            add(e);
        }
    }
}
