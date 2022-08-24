package Tp06;


import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null,"Usando Funciones Trigonometricas.");

        double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce un ángulo: "));

        Scanner l= new Scanner(System.in);

        double a6 = Double.parseDouble(JOptionPane.showInputDialog("introduzca otro ángulo: "));

        Double a1, a2, a3, a4, a5, b1, b2;
        a1= Math.sin(a);
        a2=Math.cos(a);
        a3=Math.tan(a);
        a4=Math.atan(a);
        a5=Math.atan2(a,a6);

        JOptionPane.showMessageDialog(null, "El valor del seno de "+a+" es: "+a1+"\n\n"+"El valor del coseno de "+a+" es: "+a2+"\n\n"+"El valor de la tangente de "+a+" es: "+a3+"\n\n"+"El valor del arcotangente de "+a+" es: "+a4+"\n\n"+"El valor del arcotangente entre "+a+" y "+a6+" es: "+a5);

        JOptionPane.showMessageDialog(null,"Exponencial y Logaritmo Natural.");


        double num= Double.parseDouble(JOptionPane.showInputDialog("Introduce un Número: "));
        b1= Math.exp(num);
        b2=Math.log(num);
        JOptionPane.showMessageDialog(null,"El exponencial de "+num+" es: "+b1+"\n\n"+"El Logaritmo natural en base e de "+num+" es: "+b2);

        JOptionPane.showMessageDialog(null,"Constantes PI y E.");
        JOptionPane.showMessageDialog(null,"El numero Pi es: "+Math.PI+"\n"+"\n"+"El numero e es : "+Math.E);



    }

}