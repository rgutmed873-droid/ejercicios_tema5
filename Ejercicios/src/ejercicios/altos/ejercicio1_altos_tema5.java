package ejercicios.altos;

import java.util.Scanner;

public class ejercicio1_altos_tema5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota");
        int nota = sc.nextInt();

        switch (nota){
            case 1,2,3:
                System.out.println("Muy deficiente");
                break;
        }
        switch (nota){
            case 4:
                System.out.println("Insuficiente");
                break;
        }
        switch (nota){
            case 5:
                System.out.println("Insuficiente");
                break;
        }
        switch (nota){
            case 6:
                System.out.println("bien");
                break;
        }
        switch (nota){
            case 7,8:
                System.out.println("Notable");
                break;
        }
        switch (nota){
            case 9,10:
                System.out.println("Sobresaliente");
                break;
        }
    }
}
