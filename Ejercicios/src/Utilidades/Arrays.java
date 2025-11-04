package Utilidades;

public class Arrays {
    public static void main(String[] args) {

//    primerMetodoOrdenacionArrays();
//    tercerMetodoArrays();
        int numeroAEvaluar = utils.pedirNumeroUsuario("Dame un numero");
        esPalindromo(numeroAEvaluar);


    }

    private static void esPalindromo(int numeroAEvaluar){

        int numeroCifras = 4;
        int[]arraysCifras = new int[numeroCifras];

        for (int i = 0; i < arraysCifras.length; i++) {
            arraysCifras[i] = numeroAEvaluar/(int) Math.pow(10,numeroCifras-i-1);
            //numeroAEvaluar = numeroAEvaluar%(int) Math.pow(10,numeroCifras-i-1);
            numeroAEvaluar = numeroAEvaluar - arraysCifras[i] * (int) Math.pow(10,numeroCifras-i-1);
            System.out.println("Array ");

        }

        for (int i = 0; i < numeroCifras; i++) {
            if (arraysCifras[0] == arraysCifras[3] && arraysCifras[1] == arraysCifras[2]){
                System.out.println("Es palindromo");
            }else System.out.println("no lo es");

        }

    }

//    private static void tercerMetodoArrays(){
//        int array[] = new int[10];
//        int arrayOrdenado[] = new int[array.length];
//        boolean estaOrdenado = false;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = utils.pedirNumeroAleatorio(1, 10);
//
//        }
//
//        utils.mostrarArray(array);
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length; j++) {
//                if (array[i] > array[j]){
//                    int aux = array[i];
//                    array[i] = array[j];
//                    array[j] = aux;
//                }
//
//            }
//
//        }
//        System.out.println("El array ordenado");
//        utils.mostrarArray(array);
//
//    }



//    private static void primerMetodoOrdenacionArrays(){
//
//        int array[] = new int[10];
//        int arrayOrdenado[] = new int[array.length];
//        boolean estaOrdenado = false;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = utils.pedirNumeroAleatorio(1, 10);
//
//        }
//
//        utils.mostrarArray(array);
//
//        while (!estaOrdenado) {
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    int aux = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = aux;
//                    estaOrdenado = false;
//                }
//            }
//
//            for (int i = 0; i < array.length-1; i++) {
//                if (array[i] > array[i + 1]){
//                    estaOrdenado = false;
//                    break;
//                }else estaOrdenado = true;
//
//            }
//
//        }
//        System.out.println("El array ordenado");
//        utils.mostrarArray(array);
//    }
}