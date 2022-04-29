package view.eventos;

import view.paneles.PanelLetra;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventLetterPressed implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        char a = e.getKeyChar();

        if (a >= 97 && a <= 122 || a == 'ñ') {
            String b = String.valueOf(a);
            b = b.toUpperCase();

            if (PanelLetra.getArrayPaneles()[PanelLetra.getFila()][PanelLetra.getColumna()].getText().length() == 0) {
                PanelLetra.getArrayPaneles()[PanelLetra.getFila()][PanelLetra.getColumna()].setText(b);
                if (PanelLetra.getArrayPaneles()[PanelLetra.getFila()][PanelLetra.getColumna()].getPosicion() != 4) {
                    PanelLetra.plusColumna();
                }
            }
        } else if (e.getKeyCode() == 8) {
                if (PanelLetra.getArrayPaneles()[PanelLetra.getFila()][PanelLetra.getColumna()].getText().length() == 0) {
                    if(PanelLetra.getColumna() != 0) {
                        PanelLetra.getArrayPaneles()[PanelLetra.getFila()][PanelLetra.getColumna() - 1].setText("");
                        PanelLetra.borrarTexto();
                    }
                } else {
                    PanelLetra.getArrayPaneles()[PanelLetra.getFila()][PanelLetra.getColumna()].setText("");
                }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
