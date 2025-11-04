package ejercicios.medios;

import java.util.Scanner;

public class ejercicio1_medio_tema5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int negativos = 0;
       int bajos = 0;
       int medios = 0;
       int grandes = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número");
            int num = sc.nextInt();
            if (num<0){
                negativos +=num;
            } else if (num>=0&&num<=25){
                bajos += num;
            } else if (num>=26&&num<=250) {
                medios += num;
            } else if (num>250) {
                grandes += num;
            }
        }
        System.out.println("La suma de negativos es" + " " + negativos);
        System.out.println("La suma de bajos es" + " " + bajos);
        System.out.println("La suma de medios es" + " " + medios);
        System.out.println("La suma de grandes es" + " " + grandes);
        sc.close();
    }
}
