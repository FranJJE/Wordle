import controller.Controller;
import view.cajas.CajaLetra;
import view.paneles.PanelLetra;
import view.paneles.PanelPrincipal;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        Controller control = new Controller();

        System.out.println(control.getWord());
        System.out.println("hola");

        while(true)
        {
            System.out.print("Palabra => ");
            String palabra = sc.nextLine();
            if(palabra.equals("salir")) break;
            System.out.println(Arrays.toString(control.getLetters(palabra)));
        }

         */
        new PanelPrincipal();
    }
}
