package view.eventos;

import controller.Controller;
import model.Model;
import view.botones.BotonTeclado;
import view.cajas.CajaLetra;
import view.paneles.PanelLetra;
import view.paneles.PanelPrincipal;
import view.paneles.PanelTeclado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static view.paneles.PanelLetra.letrasPanel;
import static view.paneles.PanelPrincipal.correcta;

public class EventLetterPressed implements KeyListener {
    private CajaLetra[][] letras;
    private Model model;
    private PanelTeclado teclado;

    public EventLetterPressed()
    {
        teclado = Controller.getTeclado();
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
            String word = getLetras();

            if(model.checkIfExists(word)){
                int[] result = model.checkLetters(word);

                if (PanelLetra.getFila() >= 4) {
                    for (int b : result) {
                        if (b != 2) {
                            correcta.setVisible(true);
                        }
                    }
                }
                for (int i = 0; i < result.length; i++) {
                    switch (result[i]) {
                        case 0:
                            letras[PanelLetra.fila][i].setBackground(new Color(89, 87, 87));
                            letras[PanelLetra.fila][i].setForeground(Color.white);
                            pintarTeclado(letras[PanelLetra.fila][i].getText(), 0);
                            break;
                        case 1:
                            letras[PanelLetra.fila][i].setBackground(new Color(210, 174, 26));
                            letras[PanelLetra.fila][i].setForeground(Color.white);
                            pintarTeclado(letras[PanelLetra.fila][i].getText(), 1);
                            break;
                        case 2:
                            letras[PanelLetra.fila][i].setBackground(new Color(62, 157, 23));
                            letras[PanelLetra.fila][i].setForeground(Color.white);
                            pintarTeclado(letras[PanelLetra.fila][i].getText(), 2);
                            break;
                    }
                }
                PanelLetra.fila++;
                PanelLetra.columna = 0;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"La palabra no existe");
            }
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
    public void pintarTeclado(String a, int tipo) {
        for(BotonTeclado b : teclado.getBotones()) {
            switch (tipo) {
                case 0:
                    if(b.getText().equals(a)) {
                        b.setBackground(new Color(89,87,87));
                        b.setForeground(Color.white);
                    }
                    break;
                case 1:
                    if(b.getText().equals(a)) {
                        b.setBackground(new Color(210, 174, 26));
                        b.setForeground(Color.white);
                    }
                    break;
                case 2:
                    if(b.getText().equals(a)) {
                        b.setBackground(new Color(62, 157, 23));
                        b.setForeground(Color.white);
                    }
                    break;
            }
        }
    }
}
