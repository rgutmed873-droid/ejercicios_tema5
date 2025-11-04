package Utilidades;

import java.util.Scanner;

public class utils {

    public static void inicializarArrayNumerosAleatorios(int[] array, int max, int min){

        for (int i = 0; i < array.length; i++) {
            array[i] = pedirNumeroAleatorio(min, max);

        }
    }


    public static void multiplicarValorArray(int []array, int factorMultiplicador){

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * factorMultiplicador;

        }
    }

    public static void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor array["+i+"] ="+array[i]);
        }
    }


    /**
     * Metodo para mostrar la serie bifonacci de forma iterativa
     */
    public static void mostrarSerieBifonacci(){

        int nElementos = pedirNumeroUsuario("Dame el numero" + "de elementos de la serie de Fibonacci");

        int a = 1;
        int b = 1;

        System.out.println("Elementos Bifonacci: ");
        for (int i = 0; i <= nElementos ; i++) {
            int sumaElementos = a + b;
            a = b;
            b = sumaElementos;
            System.out.println("\t" + sumaElementos);
        }
    }
    /**
     * Metodo para mostrar la serie Bifonacci de forma recursiva
     */
    public static int mostrarSerieBifonacciRecursivamente(int elemento) {

        if (elemento == 0)
            return 0;
        else if (elemento == 1) {
            return 1;
        } else {

            int resultado = mostrarSerieBifonacciRecursivamente(elemento - 1
                    + mostrarSerieBifonacciRecursivamente(elemento - 2));
            return resultado;
        }
    }

    /**
     *
     * @param numeroFactorial
     * @return
     */
    public static int resultadoFactorial(int numeroFactorial){

    int factorial = 1;

    for (int i = 1; i <= numeroFactorial ; i++){
        System.out.println("Factorial:" + factorial + " multiplicado por: " + i);
        factorial = factorial * i;
    }

        System.out.println("El resultado final es" + factorial);
    return factorial;
    }

    public static int factorialRecursivo(int numeroFactorial){

        int factorial = 1;

        if(numeroFactorial == 1){
            factorial = 1;
        }else {
            factorial = numeroFactorial * factorialRecursivo(numeroFactorial-1);
        }

        return factorial;
    }


    public static int pedirNumeroUsuario(String msg) {

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);

        int numeroUsuario = sc.nextInt();

        return numeroUsuario;
    }

    public static boolean esPrimo(int numeroAEvaluar){
        boolean esPrimo = true;

        for (int i = numeroAEvaluar-1; i > 1 ; i--){
            System.out.println("Numero evaluar: "+ numeroAEvaluar + "La I" + i + "resto:" + numeroAEvaluar);
            if (numeroAEvaluar%i == 0){
                esPrimo = false;
                break;
            }

        }
        return esPrimo;
    }

    public static String pedirStringUsuario(String msg) {

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);

        String stringUsuario = sc.nextLine();

        return stringUsuario;
    }

    public static int pedirNumeroAleatorio(int min, int max) {

        int numeroAleatorio = (int) Math.round(Math.random() * 10);
        return numeroAleatorio;
    }

    /**
     * Metodo para solicitar una cadena/frase al usuario.
     * @param cadenaInicial texto que le va a salir en pantalla al usuario
     * @return la cadena introducida por el usuario
     */

    public static String pedirCadenaUsuarioSinMensajeInicial(){

        String cadenaUsuario = "";

        Scanner sc = new Scanner(System.in);

        cadenaUsuario = sc.next(); //Cambiar a nextLine() si da problema
        return cadenaUsuario;
    }

}