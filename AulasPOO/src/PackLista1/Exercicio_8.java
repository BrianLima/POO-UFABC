/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackLista1;

import java.util.Arrays;
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

    public static void main(String[] args) {
        int[][] vector = new int[4][3];
        float[] averages = new float[7];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                vector[i][j] = rand.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            averages[i] = average(vector[i]);

            System.out.println("A média da " + (i + 1) + "ª linha é "
                    + averages[i]);
        }
        for (int i = 0; i < 3; i++) {
            int[] column = new int[3];
            column[0] = vector[i][0];
            column[1] = vector[i][1];
            column[2] = vector[i][2];
            averages[i + 4] = average(column);

            System.out.println("A média da " + (i + 1) + "ª coluna é "
                    + averages[i + 4]);
        }

        Arrays.sort(averages);

        System.out.println("A menor média foi:" + averages[0]);
        System.out.println("A maior média foi:" + averages[6]);

        float[][] numbers = new float[12][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 12; k++) {
                    if (numbers[k][0] != vector[i][j] && numbers[k][0] == 0) {
                        numbers[k][0] = vector[i][j];
                        numbers[k][1]++;
                        break;
                    } else if (numbers[k][0] == vector[i][j] && numbers[k][0] != 0) {
                        numbers[k][1]++;
                    }
                }
            }
        }

        for (int i = 0; i < 12; i++) {
            if (numbers[i][1] != 0) {
                System.out.println("O numero " + numbers[i][0] + " apareceu " + numbers[i][1] + " vezes");
            }
        }
    }

    static float average(int[] values) {
        int result = 0;

        for (int i = 0; i < values.length; i++) {
            result += values[i];
        }

        result = result / values.length;

        return result;
    }
}
