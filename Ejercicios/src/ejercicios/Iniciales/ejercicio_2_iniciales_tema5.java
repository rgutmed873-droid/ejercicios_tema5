package ejercicios.Iniciales;

import java.util.Scanner;

public class ejercicio_2_iniciales_tema5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();


        if (num1 < num2){
            System.out.println("El número menor es " + " " + num1);
        } else if (num2 < num1) {
            System.out.println("El número menor es " + " " + num2);

        }else {
            System.out.println("Ambos número son iguales");
        }
    }
}
