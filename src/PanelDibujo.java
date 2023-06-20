import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PanelDibujo extends JPanel{
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private double peso, estatura, imc;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura = getWidth();
        int altura = getHeight();
        //g.drawLine(0,0, anchura, altura);
        //g.drawLine(0, altura, anchura, 0);
        //g.drawLine(10,10,10,200);
        //g.drawLine(10,10,80,50);
        //g.drawLine(80,50,10,100);
        //g.drawRoundRect(0,0,50,50,30,30);
        System.out.print("\nIngrese su nombre: ");
        nombre = sc.next();
        g.drawString("Nombre: " + nombre, 20, 20);
        System.out.print("Ingrese su peso (KG): ");
        peso = sc.nextDouble();
        g.drawString("Peso: " + peso, 20, 40);
        System.out.print("Ingrese su estatura (CM): ");
        estatura = sc.nextDouble();
        g.drawString("Estatura: " + estatura, 20, 60);
        peso = (peso / 100);
        imc = (peso / (estatura*estatura));
        g.drawString("IMC: " + imc, 20, 80);
    }
}
