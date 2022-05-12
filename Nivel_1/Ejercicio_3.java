package Nivel_1;

import java.util.Scanner;

public class Ejercicio_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Digite el número:");
        Integer cant = scanner.nextInt();

        for(int i = 0; i < cant; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }

    }

}
