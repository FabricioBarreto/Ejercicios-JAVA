package Nivel_1;

import java.util.Scanner;

public class Ejercicio_9 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Digite la frase:");
        String frase = scanner.nextLine();
        System.out.println("Digite la letra a buscar:");
        String c = scanner.next();
        char letra = c.charAt(0);

        Integer cont = 0;

        for(int i = 0; i < frase.length(); i++){

            char l = frase.charAt(i);

            if(letra == l){
                cont++;
            }
        }
        System.out.println("La letra '" + letra + "' se repite " + cont + " veces.");
    }
}
