/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tralk
 */
import java.util.Arrays;

public class Programa2_Ordenacion2D {
    
    public static void main(String[] args) {
        // Declarar y inicializar matriz 3x3
        int[][] matriz = {
            {9, 2, 6},
            {2, 5, 4},
            {9, 1, 6}
        };
        
        // Fila a ordenar cuento asi 0,1,2 supongo
        int filaAOrdenar = 1;
        
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
            // Aqui se crea una copia 
        int[][] matrizOrdenada = copiarMatriz(matriz);
        
        // Aqui ordeno la fila
        ordenarFila(matrizOrdenada, filaAOrdenar);
        
        System.out.println("\nNueva matriz con la fila " + filaAOrdenar + " ordenada:");
        mostrarMatriz(matrizOrdenada);
    }
    
    // Aqui se usa Arrays.sort
    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            Arrays.sort(matriz[fila]);
        }
    }
    
    // Aqui se copea la matriz 
    public static int[][] copiarMatriz(int[][] original) {
        int[][] copia = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i].clone();
        }
        return copia;
    }
    
    // Aqui inprimo la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}