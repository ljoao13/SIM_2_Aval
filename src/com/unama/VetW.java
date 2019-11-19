package com.unama;

import java.util.Scanner;

public class VetW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[7];
        for (int i=0; i<vetor.length; i++){
            System.out.println("Informe o valor da posição " + i);
            vetor[i] = sc.nextInt();
        }
        int maior = 0;
        int indiceMaior = 0;
        int menor = vetor[0];
        int indeceMenor = 0;
        for (int i=0; i<vetor.length; i++){
            if (vetor[i]>maior){
                maior = vetor[i];
                indiceMaior = i;
            }
        }
        System.out.println("O maior valor é: " +maior);
        System.out.println("O indice do maior valor é: " +indiceMaior);
        for (int i=1; i<vetor.length; i++){
            if (menor > vetor[i]){
                menor = vetor[i];
                indeceMenor = i;
            }
        }
        System.out.println("O menor valor é:" +menor);
        System.out.println("O indice do menor valor é: " +indeceMenor);
    }
}
