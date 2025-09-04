/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa1_busqueda2d;

/**
 *
 * @author tralk
 */
public class Programa1_Busqueda2D {

    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {5, 8, 3},
            {2, 7, 4},
            {9, 1, 6}
        };
        // Imprimir la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int valorABuscar = 7;
        int[] posicion = buscarValor(matriz, valorABuscar);

        if (posicion[0] != -1) {
            System.out.println("Valor " + valorABuscar + " encontrado en: [" + 
                             posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("Valor " + valorABuscar + " no encontrado");
        }
    }
}