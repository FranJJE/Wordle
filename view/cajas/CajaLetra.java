package view.cajas;

import javax.swing.*;
import java.awt.*;

public class CajaLetra extends JTextField {
    private final int posicion;

    public CajaLetra(int posicion) {
        this.posicion = posicion;
        setBackground(Color.WHITE);

    }

    public int getPosicion() {
        return posicion;
    }
}
