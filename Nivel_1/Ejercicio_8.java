package Nivel_1;

import java.util.Scanner;

public class Ejercicio_8 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Digite su nombre y apellido:");
        String nombre = scanner.nextLine();
        System.out.println("Digite su edad:");
        String edad = scanner.nextLine();
        System.out.println("Digite su dirección:");
        String direccion = scanner.nextLine();
        System.out.println("Digite su ciudad:");
        String ciudad = scanner.nextLine();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);

    }

}
