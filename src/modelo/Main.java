package modelo;

import modelo.paneles.PanelPrincipal;

import javax.swing.*;
import java.awt.*;

public class Main {
    PanelPrincipal nuevo = new PanelPrincipal();

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception e){
            System.out.println(e);
        }
        Main nuevoo = new Main();
    }

}
