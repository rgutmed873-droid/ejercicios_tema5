package ejercicios.Iniciales;

import java.util.Scanner;

public class ejercicio_4_iniciales_tema5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();
        System.out.println("Introduce el cuarto numero");
        int num4 = sc.nextInt();
        System.out.println("Introduce el quinto numero");
        int num5 = sc.nextInt();

        int menor = num1;

        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;
        if (num4 < menor) menor = num4;
        if (num5 < menor) menor = num5;

        System.out.println("El número menor es" + " " + menor);
    }
}
