package view.eventos;

import model.Model;
import view.cajas.CajaLetra;
import view.paneles.PanelLetra;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClickSubmit implements ActionListener
{
    private CajaLetra[][] letrasPanel;
    private Model model;
    private int fila = PanelLetra.getFila();

    public EventClickSubmit(Model model, CajaLetra[][] letrasPanel)
    {
        this.model = model;
        this.letrasPanel = letrasPanel;
    }

   @Override
    public void actionPerformed(ActionEvent e) {

        int[] result = model.checkLetters( getLetras());

        for(int i = 0; i < result.length; i++)
        {
            switch (result[i])
            {
                case 0:
                    letrasPanel[fila][i].setBackground(Color.gray);
                    break;
                case 1:
                    letrasPanel[fila][i].setBackground(Color.yellow);
                    break;
                case 2:
                    letrasPanel[fila][i].setBackground(Color.green);
                    break;
            }
        }
    }

    public String getLetras()
    {
        String word ="";

        for(int i = 0; i < letrasPanel.length; i++)
        {
            word += letrasPanel[fila][i].getText();
        }
        return word;
    }
}
