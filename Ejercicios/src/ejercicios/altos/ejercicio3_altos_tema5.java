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
                break;
            case 2:
                System.out.println("Introduce el valor del radio");
                int num3 = sc.nextInt();
                int pi = (int) Math.PI;
                double superficie = (Math.pow(num3,2)*pi);
                System.out.println("El valor de la superficie es" + " " + superficie);
                break;
            case 3:
                System.out.println("Introduce el valor del radio");
                int num4 = sc.nextInt();
                pi = (int) Math.PI;
                double perimetro = (2*(Math.pow(num4,2))*pi);
                System.out.println("El valor del perimtero es" + " " + perimetro);
                break;
            case 4:
                System.out.println("Introduce el valor de la base");
                int base = sc.nextInt();
                System.out.println("Introduce el valor de la altura");
                int altura = sc.nextInt();
                int area = base*altura;
                System.out.println("El valor del area del rectangulo es" + " " + area);
                break;
            case 5:
                System.out.println("Introduce el valor de la base");
                int base2 = sc.nextInt();
                System.out.println("Introduce el valor de la altura");
                int altura2 = sc.nextInt();
                int areaTriangulo = (base2*altura2)/2;
                System.out.println("El valor del area del tríangulo es" + " " + areaTriangulo);
                break;
        }

        if (opcion<=0){
            System.out.println("Opción incorrecta");
        }else if (opcion>5){
            System.out.println("Opción incorrecta");
        }
    }
}
