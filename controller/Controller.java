package controller;

import model.Model;

public class Controller {
    Model model = new Model();

    public int[] getLetters(String userWord)
    {
        return model.isSame(userWord) ? new int[]{2,2,2,2,2} : model.checkLetters(userWord);
    }

    public String getWord()
    {
        return model.getWord();
    }
}
