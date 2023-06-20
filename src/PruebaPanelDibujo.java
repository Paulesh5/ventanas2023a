import javax.swing.*;
import java.util.Scanner;

public class PruebaPanelDibujo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creo una instancia de la clase PanelDiujo y la llamo panel
        PanelDibujo panel = new PanelDibujo();
        //creo un marco en la ventana
        JFrame aplicacion = new JFrame();
        //pongo un boton para cerrar la ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel);//agrego un "panel" a la ventana
        aplicacion.setSize(250,250);//seteo el tamaño de la ventana
        aplicacion.setVisible(true);//permio que se vea la ventana
    }
}
