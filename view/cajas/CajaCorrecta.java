package view.cajas;

import controller.Controller;
import model.Model;
import view.paneles.PanelPrincipal;

import javax.swing.*;
import java.awt.*;

public class CajaCorrecta extends JTextField {
    private Model model;
    public CajaCorrecta() {
        model = Controller.getModel();
        setHorizontalAlignment(CajaCorrecta.CENTER);
        setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
        setBounds(310,410,500,50);
        setText("La palabra correcta era " + "\"" + model.getWord()+ "\"");
        setBorder(null);
        setFocusable(false);
        setEditable(false);
        setVisible(false);
    }
}
