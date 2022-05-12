package Nivel_1;

import java.util.Scanner;

public class Ejercicio_4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Digite el número a factorizar:");
        Integer num = scanner.nextInt();
        Integer res = 1;

        for(int i = 1; i <= num; i++){
            res *= i;
        }
        System.out.println("El resultado es: " + res);
    }

}
