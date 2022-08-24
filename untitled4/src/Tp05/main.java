package Tp05;


import javax.swing.*;

public class main {

    public static void main(String[] args) {

        //Me quedo largo el programa pero fue la unica forma que encontre de que me de el resultado correcto.

        float num1 = 6;
        float num2 = 5;
        float n1 = num1/num2;

        float num3 = 2;
        float num4 = 3;
        float n2 = num3/num4;

        float num5 = 7;
        float num6 = 2;
        float n3 = num5/num6;

        float num7 = 2;
        float num8 = 30;
        float n4 = num7/num8;

        float mult = n2*n3;
        float numerador = n1-mult+n4;

        float num9 = 1;
        float num10 = 3;
        float n5 = num9/num10;

        float denominador = n5/5;
        float resultado = numerador/denominador;

        JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);

    }

}
