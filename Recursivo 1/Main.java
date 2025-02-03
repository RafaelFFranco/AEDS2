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
                    System.out.println("2-Ok");
                    break;
                case 3:
                    System.out.println("3-Ok");
                    break;
                default:
                    System.out.println("Default-Ok");
                    break;

            }
        } while (escolha!= 0);
    }
}
