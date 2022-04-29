package controller;

import model.Model;
import view.eventos.EventClickSubmit;
import view.paneles.PanelLetra;
import view.paneles.PanelPrincipal;

public class Controller {
    private static Model model = new Model();
    private PanelPrincipal view = new PanelPrincipal();

    public Controller()
    {

    }

    public int[] getLetters(String userWord)
    {
        return model.isSame(userWord) ? new int[]{2,2,2,2,2} : model.checkLetters(userWord);
    }

    public String getWord()
    {
        return model.getWord();
    }

    public static Model getModel()
    {
        return model;
    }


}
