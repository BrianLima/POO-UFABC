package PackLista1;

import java.util.Scanner;

/**
 * Exercicio 1 
 * Autor: Brian Lima 
 * Data: 12/10/2014 
 * Descrição: Elabore um programa que solicite um valor representando tempo 
 * em segundos, imprima quantos dias, horas, minutos e segundos equivale 
 * o tempo digitado
 */
public class Exercicio_1 {

    public static void main(String args[]) {
        System.out.println("Digite o valor que representa o tempo em segundos");

        Scanner scan = new Scanner(System.in);
        int seconds = scan.nextInt();

        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int minutes = seconds / 60;

        System.out.println("Existem " + hours + " horas, " + minutes + " minutos e " + seconds + " segundos");
    }
}
