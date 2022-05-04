import controller.Controller;
import view.cajas.CajaLetra;
import view.paneles.PanelLetra;
import view.paneles.PanelPrincipal;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception e){
            System.out.println(e);
        }

        Scanner sc = new Scanner(System.in);
        Controller control = new Controller();

        System.out.println(control.getWord());

        /********************* MANUAL CHECK *******************/
        /*while(true)
        {
            System.out.print("Palabra => ");
            String palabra = sc.nextLine();
            if(palabra.equals("salir")) break;
            System.out.println(Arrays.toString(control.getLetters(palabra)));
        }*/
    }
}
