/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 1499754
 */
public class Util {
    public Util(){}
    
    
    //300 300 -1
    
    public int recursivoSomaPares(int n){
        if(n == 0){
            return 0;
        }else if(n % 2 == 0){
            return n + recursivoSomaPares(n-1);
        }else{
            return 0 + recursivoSomaPares(n-1);
        }
    }
    
    public double recursivoSomaVetor(double[] array, int i){
        if(array.length == 1){
            return array[0];
        }else{
            return array[i-1] + recursivoSomaVetor(array, array.length-1);
        }
    }
    
    public int recursivoQuantidadeRepeticoes(int[] array, int n){
        if(array.length == 1 && array[array.length-1] == n){
            return 0;
        }else if()
        
    }
    
}
