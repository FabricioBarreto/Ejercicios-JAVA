package Nivel_1;

import java.util.Scanner;

public class Ejercicio_7 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Digite la palabra a convertir:");
        String palabra = scanner.next();

        String min = "abcdefghijklmnñopqrstuvwxyz";
        String may = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String nueva = "";

        for (int i = 0; i < palabra.length(); i++){

            Character letra = palabra.charAt(i);

            Character letraM = may.charAt(min.indexOf(letra));

            nueva += letraM;
        }
        System.out.println(nueva);
    }

}
