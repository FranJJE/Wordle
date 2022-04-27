package view.cajas;

import javax.swing.*;
import java.awt.*;

public class CajaLetra extends JTextField {
    private final int posicion;

    public CajaLetra(int posicion) {
        this.posicion = posicion;
        setBackground(Color.WHITE);
        setHorizontalAlignment(CajaLetra.CENTER);
        setFont(new Font(Font.DIALOG, Font.BOLD, 22));
        setEditable(false);
        setFocusable(false);

    }

    public int getPosicion() {
        return posicion;
    }
}
