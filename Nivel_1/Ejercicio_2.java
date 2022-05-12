package Nivel_1;

import java.util.Scanner;

public class Ejercicio_2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Digite el pimer número:");
        Integer num1 = scanner.nextInt();
        System.out.println("Digite el segundo número:");
        Integer num2 = scanner.nextInt();

        Integer res = num1 + num2;
        System.out.println(num1 +  " + " + num2 + " = " + res);
        res = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + res);
        res = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + res);
        res = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + res);
        res = num1 % num2;
        System.out.println(num1 + " % "+  num2 + " = " + res);
    }

}