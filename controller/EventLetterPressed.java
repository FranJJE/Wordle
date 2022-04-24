package controller;

import view.paneles.PanelLetra;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventLetterPressed implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        char a = e.getKeyChar();
        boolean condition = false;

        for (int i = 0; i < 26; i++) {
            if (a == 'A' + i) condition = true;
        }
        if (a == 'Ñ') condition = true;
        if (!condition) {
            if(PanelLetra.getArrayPaneles()[PanelLetra.getFila()][PanelLetra.getColumna()].getText().length() == 0) {
                PanelLetra.getArrayPaneles()[PanelLetra.getFila()][PanelLetra.getColumna()].setText(String.valueOf(a));
                if (PanelLetra.getArrayPaneles()[PanelLetra.getFila()][PanelLetra.getColumna()].getPosicion() != 4) {
                    PanelLetra.plusColumna();
                }
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
