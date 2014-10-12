package PackLista1;

/**
 * Exercicio 2 
 * Autor: Brian Lima 
 * Data: 12/10/2014 
 * Descrição: Leia dois números inteiros, x e y, e imprima o quociente e o 
 * resto da divisão inteira entre eles.
 */

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String args[]) {
        System.out.println("Digite o valor para X");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        System.out.println("Digite o valor para Y");
        int y = scan.nextInt();

        System.out.println("O quociente da divisão é " + x / y + " e o resto da "
                + "divisão é " + x % y);
    }
}
