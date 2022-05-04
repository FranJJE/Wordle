package view.eventos;

import controller.Controller;
import model.Model;
import view.cajas.CajaCorrecta;
import view.cajas.CajaLetra;
import view.paneles.PanelLetra;
import view.paneles.PanelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static view.paneles.PanelLetra.letrasPanel;

public class EventClickSubmit implements ActionListener, KeyListener
{

    private CajaLetra[][] letras;
    private Model model;
    private static CajaCorrecta correcta;

    public EventClickSubmit()
    {
        correcta = PanelPrincipal.getCorrecta();
        model = Controller.getModel();
        letras = PanelLetra.letrasPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String word = getLetras();

        if(model.checkIfExists(word)){
            int[] result = model.checkLetters(word);

            if (PanelLetra.getFila() >= 4) {
                for (int a : result) {
                    if (a != 2) {
                        correcta.setVisible(true);
                    }
                }
            }
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
        else
        {
            JOptionPane.showMessageDialog(null,"La palabra no existe");
        }


    }

    public String getLetras()
    {
        String word = "";

        for (int i = 0; i < letras.length; i++) {
            word += letrasPanel[PanelLetra.fila][i].getText();
        }

        return word.toLowerCase();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
