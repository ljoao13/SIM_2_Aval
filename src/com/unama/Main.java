package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                System.out.println("Entre com o valor na posição " +i+j);
                matriz[i][j] = sc.nextInt();

            }
        }
        System.out.println("Valores da diagonal principal:");
        for (int i=0; i<matriz.length; i++){
            System.out.println(matriz[i][i]);

        }
        System.out.println("Valores da diagonal secundária:");
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                if (i+j == matriz.length-1){
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}
