package view.eventos;

import controller.Controller;
import model.Model;
import view.cajas.CajaLetra;
import view.paneles.PanelLetra;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static view.paneles.PanelLetra.letrasPanel;

public class EventClickSubmit implements ActionListener
{

    private CajaLetra[][] letras;
    private Model model;

    public EventClickSubmit()
    {
        model = Controller.getModel();
        letras = PanelLetra.letrasPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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

    public String getLetras()
    {
        String word = "";

        for (int i = 0; i < letras.length; i++) {
            word += letrasPanel[PanelLetra.fila][i].getText();
        }

        return word.toLowerCase();
    }
}
