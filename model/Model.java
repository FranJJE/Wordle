package model;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.*;

public class Model {
    private String word;

    public Model()
    {
        word = getOneWord();
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

    public String getOneWord()
    {
        int num = (int)(Math.random()*1000);
        String word ="";

        try
        {
            Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/wordledb","root","admin");

            Statement st = ct.createStatement();

            ResultSet rs = st.executeQuery("select word from wordpool where id="+num);

            while(rs.next())
            {
                word = rs.getString("word");
            }

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

        return word;
    }

    public boolean checkIfExists(String userWord)
    {
        String word ="";

        try
        {
            Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/wordledb","root","admin");

            Statement st = ct.createStatement();

            ResultSet rs = st.executeQuery("select word from wordpool where word='"+userWord+"'");

            while(rs.next())
            {
                word = rs.getString("word");
            }

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

        return !word.equals("");
    }

    public String getWord()
    {
        return word;
    }
}
