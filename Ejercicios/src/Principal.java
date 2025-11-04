import Utilidades.utils;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
     public static void main(String[] args) {



        int longitudArray = 5;
        int factor = 10;

        int []array = new int[longitudArray];

        //paso el valor y paso referencia
        int max = utils.pedirNumeroUsuario("Dame el máximo del array");
        int min = utils.pedirNumeroUsuario("Dame el mínimo del array");

        utils.inicializarArrayNumerosAleatorios(array,max,min);
        utils.mostrarArray(array);
        utils.multiplicarValorArray(array,factor);
        utils.mostrarArray(array);

      //         int factorial = utils.factorialRecursivo(5);
//         System.out.println("Numero factorial:" + factorial);

//    int numeroDePrimos = 0;
//    int numeroMaximoPrimos = utils.pedirNumeroUsuario("Dame el limite de primos que quieres saber");
//    int numeroMinimoPrimos = utils.pedirNumeroUsuario("Dame el mínimo de primos que quieres saber");
//
//        for (int i = numeroMinimoPrimos ; numeroDePrimos < numeroMaximoPrimos; i++){ //1-99
//            if (utils.esPrimo(i))
//            System.out.println("El numero:" + i + " es primo" + utils.esPrimo(i));
//            numeroDePrimos = numeroDePrimos +1; //numeroDePrimos ++;
//        }
//        System.out.println("Hay"+ numeroDePrimos + " numero de primos");


//         int contador = 0;
//        while (numeroDePrimos < numeroMaximoPrimos);
    }

}