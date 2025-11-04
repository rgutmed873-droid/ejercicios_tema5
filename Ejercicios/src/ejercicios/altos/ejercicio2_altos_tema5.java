package ejercicios.altos;

import java.util.Scanner;

public class ejercicio2_altos_tema5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t1. Racies");
        System.out.println("\t2. Potencia");
        System.out.println("\t3. Módulo de la division");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Introduce un número para la raíz cuadrada");
                int numero = sc.nextInt();
                double raiz = Math.sqrt(numero);
                System.out.println("El resultado de la raiz es" + " " + raiz);
                break;
        }
        switch (opcion){
            case 2:
                System.out.println("Introduce la base");
                int numero = sc.nextInt();
                System.out.println("Introduce el exponente");
                int exponente = sc.nextInt();
                double potencia = Math.pow(numero,exponente);
                System.out.println("El resultado de la potencia es " + " " + potencia);
                break;
        }
        switch (opcion){
            case 3:
            System.out.println("Introduce un número para el módulo");
            int numero = sc.nextInt();
            int modulo = numero%10;
            System.out.println("El resultado del módulo es" + " " + modulo);
            break;

        }


    }
}
