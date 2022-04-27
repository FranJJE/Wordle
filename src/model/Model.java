package model;

import java.io.IOException;
import java.io.RandomAccessFile;


public class Model {
    private String word;

    public Model()
    {
        selectWord();
    }
    public boolean isSame(String userWord)
    {
        return word.equals(userWord);
    }

    public int[] checkLetters(String userWord)
    {
        int[] result = new int[word.length()];

        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == userWord.charAt(i))
            {
                result[i] = 2;
            }
            else
            {
                for(int j = 0; j < word.length(); j++)
                {
                    if(result[j] == 0)
                    {
                        if(word.charAt(i) == userWord.charAt(j))
                        {
                            result[j] = 1;
                            break;
                        }
                    }
                }
            }
        }

        return result;
    }

    public void selectWord()
    {

        try(RandomAccessFile rnd = new RandomAccessFile("src\\model\\words.txt","r"))
        {
            int pos = (int)(Math.random() * rnd.length() / 6);
            rnd.seek(pos*6);
            //System.out.println(rnd.length());
            word = rnd.readLine();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public String getWord()
    {
        return word;
    }
}
