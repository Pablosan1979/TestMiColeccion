package lab_01;

import java.util.Scanner;

public class Lab_01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //5. Creando el arreglo para Atleta

        System.out.println("Ingrese la cantidad de atletas: ");
        int n = teclado.nextInt();
        Atleta[] atleta = new Atleta[n];
        double maximo = 0;
        double minimo = 9999;

        //6. ingresando datos
        for (int i = 0; i < atleta.length; i++) {
            teclado.nextLine();//permite ingresar los datos sin saltarlos
            atleta[i] = new Atleta();// creo un objeto atleta en cada ciclo
            System.out.println("Ingrese el Nombre");
            atleta[i].setNombre(teclado.nextLine());
            System.out.println("Ingrese el Pais");
            atleta[i].setPais(teclado.nextLine());
            System.out.println("Ingrese el Tiempo");
            atleta[i].setTiempo(teclado.nextDouble());

        }
        //imprimiendo con for each

//        // metodo burbuja original
//        public static void burbuja(int[] A) {
//        int i, j, aux;
//        for (i = 0; i < A.length - 1; i++) {
//            for (j = 0; j < A.length - i - 1; j++) {                                                              
//                if (A[j + 1] < A[j]) {
//                    aux = A[j + 1];
//                    A[j + 1] = A[j];
//                    A[j] = aux;
//                }
//            }
//        }
//}
        //metodo burbuja modificada
        Atleta aux;
        for (int i = 0; i < atleta.length - 1; i++) {
            for (int j = 0; j < atleta.length - i - 1; j++) {
                // aqui muestra cual es el menor o mayor segun se seleccione '<''>'
                if (atleta[j + 1].getTiempo() < atleta[j].getTiempo()) {
                    aux = atleta[j + 1];
                    atleta[j + 1] = atleta[j];
                    atleta[j] = aux;
                }
            }
        }

        System.out.println(atleta[0].getNombre() + " es el menor tiempo con un registro de: " + atleta[0].getTiempo());
        System.out.println(atleta[atleta.length - 1].getNombre() + " es el mayor tiempo con un registro de: " + atleta[atleta.length - 1].getTiempo());

        for (Atleta a : atleta) {
            System.out.println(a);
        }
    }
}
