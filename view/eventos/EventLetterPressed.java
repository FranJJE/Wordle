package view.eventos;

import controller.Controller;
import model.Model;
import view.cajas.CajaLetra;
import view.paneles.PanelLetra;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static view.paneles.PanelLetra.letrasPanel;

public class EventLetterPressed implements KeyListener {
    private CajaLetra[][] letras;
    private Model model;

    public EventLetterPressed()
    {
        model = Controller.getModel();
        letras = PanelLetra.letrasPanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char a = e.getKeyChar();

        if (a >= 97 && a <= 122 || a == 'ñ') {
            String b = String.valueOf(a);
            b = b.toUpperCase();

            if (letras[PanelLetra.getFila()][PanelLetra.getColumna()].getText().length() == 0) {
                letras[PanelLetra.getFila()][PanelLetra.getColumna()].setText(b);
                if (letras[PanelLetra.getFila()][PanelLetra.getColumna()].getPosicion() != 4) {
                    PanelLetra.plusColumna();
                }
            }
        } else if (e.getKeyCode() == 8) {
                if (letras[PanelLetra.getFila()][PanelLetra.getColumna()].getText().length() == 0) {
                    if(PanelLetra.getColumna() != 0) {
                        letras[PanelLetra.getFila()][PanelLetra.getColumna() - 1].setText("");
                        PanelLetra.borrarTexto();
                    }
                } else {
                    letras[PanelLetra.getFila()][PanelLetra.getColumna()].setText("");
                }
        } else if (e.getKeyCode() == 10) {
            int[] result = model.checkLetters(getLetras());

            for (int i = 0; i < result.length; i++) {
                switch (result[i]) {
                    case 0:
                        letras[PanelLetra.fila][i].setBackground(Color.gray);
                        break;
                    case 1:
                        letras[PanelLetra.fila][i].setBackground(Color.yellow);
                        break;
                    case 2:
                        letras[PanelLetra.fila][i].setBackground(Color.green);
                        break;
                }
            }
            PanelLetra.fila++;
            PanelLetra.columna = 0;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    public String getLetras()
    {
        String word = "";

        for (int i = 0; i < letras.length; i++) {
            word += letrasPanel[PanelLetra.fila][i].getText();
        }

        return word.toLowerCase();
    }
}
