package Tp08;

import java.util.Scanner;

public class raizScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int n1 = sc.nextInt();

        if(n1 < 0) {
            System.out.println("ERROR! El número ingresado debe ser positivo.");
        }else{
            double resultado = Math.sqrt(n1);
            System.out.println(resultado);
        }
    }

}
