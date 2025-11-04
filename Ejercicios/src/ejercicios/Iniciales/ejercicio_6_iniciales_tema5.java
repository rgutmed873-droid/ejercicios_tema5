package ejercicios.Iniciales;

import java.util.Scanner;

public class ejercicio_6_iniciales_tema5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();

        if (num%2 == 0){
            System.out.println("El número es par");
        }else {
            System.out.println("El número es impar");
        }
    }
}
