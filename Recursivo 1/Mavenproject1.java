/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author 1499754
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Util util = new Util();
        int escolha = 0;
        int resultado = 0;
        int valor = 0;
        double valorDouble = 0;
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 2;
        array[3] = 3;
        array[4] = 3;
        array[5] = 4;
        array[6] = 5;
        array[7] = 7;
        array[8] = 7;
        array[9] = 9;

        double[] arrayDouble = new double[5];
        arrayDouble[0] = 1.17;
        arrayDouble[1] = 2.52;
        arrayDouble[2] = 2.23;
        arrayDouble[3] = 3.28;
        arrayDouble[4] = 6.22;

        do {
            System.out.println("Menu");
            System.out.println("1-Somar todos numeros pares");
            System.out.println("2-Somar todos os elementos de um vetor");
            System.out.println("3-Contar numero de repeticoes de um numero em um vetor");
            System.out.println("0-Sair");

            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Escolha um limite: ");
                    valor = scan.nextInt();
                    resultado = util.recursivoSomaPares(valor);
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.println("Somando valores do vetor...");
                    valorDouble = util.recursivoSomaVetor(arrayDouble, arrayDouble.length);
                    System.out.println("A soma dos valores do vetor 'arrayDouble' é: " + valorDouble);
                    break;
                case 3:
                    System.out.println("Escolha um número:");
                    valor = scan.nextInt();
                    resultado = util.recursivoQuantidadeRepeticoes(array,valor,array.length);
                    System.out.println("O número "+valor+" se repete "+resultado+" vezes no array");
                    break;
                default:
                    System.out.println("Opção inválida, insira outro valor");
                    break;

            }
        } while (escolha!= 0);
    }
}
