package ejercicios.medios;

import java.util.Scanner;

public class ejercicio2_medio_tema5 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contadorNegativos = 0;
        int contadorBajos = 0;
        int contadorMedios = 0;
        int contadorGrandes = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número");
            int num = sc.nextInt();
            if (num<0){
                contadorNegativos++;
            } else if (num>=0&&num<=25){
                contadorBajos++;
            } else if (num>=26&&num<=250) {
                contadorMedios++;
            } else if (num>250) {
                contadorGrandes++;
            }
        }
        System.out.println("La suma de negativos es" + " " + contadorNegativos);
        System.out.println("La suma de bajos es" + " " + contadorBajos);
        System.out.println("La suma de medios es" + " " + contadorMedios);
        System.out.println("La suma de grandes es" + " " + contadorGrandes);
        sc.close();
    }

}
