import java.io.*;
import java.util.Scanner;

public class WordsDB {
    public void lookForWords(String file)
    {
        try (Scanner sc = new Scanner(new File(file)))
        {
            BufferedWriter buffer = new BufferedWriter(new FileWriter("src\\words.txt"));
            sc.useDelimiter("\\p{Space}");

            while(sc.hasNext())
            {
                String word = sc.next();

                if(word.length() == 5)
                {
                    Scanner sc1 = new Scanner(word);
                    sc1.useDelimiter("");
                    boolean contiene = false;

                    while(sc1.hasNext())
                    {
                        char letra = sc1.next().charAt(0);
                        if(letra < 97 || letra > 122)
                        {
                            contiene = true;
                            break;
                        }
                    }
                    sc1.close();

                    if(!contiene) buffer.append(word).append("\n");
                }
            }

            buffer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
