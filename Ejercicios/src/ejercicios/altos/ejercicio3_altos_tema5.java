package ejercicios.altos;

import java.util.Scanner;

public class ejercicio3_altos_tema5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t 1. Calculo de la hipotenusa de un triángulo");
        System.out.println("\t 2. Calculo de la superficie de una circunferencia");
        System.out.println("\t 3. Calculo del perímetro de una circunferencia");
        System.out.println("\t 4. Calculo del area de un rectangulo");
        System.out.println("\t 5. Calculo del area de un triangulo ");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Introduce el primer cateto");
                int num1 = sc.nextInt();
                System.out.println("Introduce el segundo cateto");
                int num2 = sc.nextInt();
                double hipotenusa = (Math.pow(num1,2) + Math.pow(num2,2));
                System.out.println("La longitud de la hipotenusa es" + " " + hipotenusa);
        }
        System.out.println("Prueba jaj");
    }
}
