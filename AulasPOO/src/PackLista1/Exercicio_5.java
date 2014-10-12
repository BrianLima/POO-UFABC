package PackLista1;

import java.util.Scanner;

/** 
* Exercicio 5
* Autor: Brian Lima 
* Data: 12/10/2014 
* Descrição:  Elabore um programa para ler uma frase e uma palavra, em seguida, 
* verificar se a palavra ocorre na frase. Caso ocorra, imprimir a quantidade 
* de vezes que ela aparece
**/ 
public class Exercicio_5 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String[] phrase = scan.nextLine().split(" ");

        System.out.println("Digite uma palavra:");
        String word = scan.nextLine();
        int count = 0;

        for (String phrase1 : phrase) {
            if (phrase1.equals(word)) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A frase digitada contém a palavra, e aparece " + count + " vezes");
        } else {
            System.out.println("A frase não contém esta palavra");
        }
    }
}
