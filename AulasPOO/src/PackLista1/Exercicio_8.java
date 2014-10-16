/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackLista1;

import java.util.Random;

/** 
* Exercicio 8
* Autor: Brian Lima 
* Data: 15/10/2014 
* Descrição: Elabore um programa que gere uma matriz aleatória de inteiros 4x3 e
* compute: 
* a. a média individual de cada linha; 
* b. a média individual de cada coluna; 
* c. exiba a maior e a menor média calculada; 
* d. exiba a frequência dos 
* elementos da matriz. 
**/ 
public class Exercicio_8 {
    public static void main(String[] args){
        int[][] vector = new int[4][3];
        int[] averages = new int[7];
        Random rand = new Random();
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                vector[i][j] = rand.nextInt();
            }
        }
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println("A média da " + (i + 1) + "ª linha é "
                    + average(vector[i]));
        }
        for (int i = 0; i < 3; i++) {
            int[] column = new int[3];
            column[0] = vector[i][0];
            column[1] = vector[i][1];
            column[2] = vector[i][2];

            System.out.println("A média da " + (i + 1) + "ª coluna é " + average(column));
        }
    }
    
    static float average(int[] values){
        int  result= 0;
        
        for (int i = 0; i < values.length; i++) {
            result += values[i];
        }
        
        result = result/values.length;
        
        return result;
    }
}
