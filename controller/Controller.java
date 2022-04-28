package controller;

import model.Model;
import view.eventos.EventClickSubmit;
import view.paneles.PanelLetra;
import view.paneles.PanelPrincipal;

public class Controller {
    Model model = new Model();
    PanelPrincipal view = new PanelPrincipal();

    public Controller()
    {
        events();
    }

    public int[] getLetters(String userWord)
    {
        return model.isSame(userWord) ? new int[]{2,2,2,2,2} : model.checkLetters(userWord);
    }

    public String getWord()
    {
        return model.getWord();
    }

    public void events()
    {
        PanelPrincipal.teclado.enviar.addActionListener( new EventClickSubmit(model, PanelLetra.letrasPanel));
    }


}
