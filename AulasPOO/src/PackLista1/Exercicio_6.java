package PackLista1;

import java.util.Arrays;
import java.util.Scanner;

/** 
* Exercicio 6
* Autor: Brian Lima 
* Data: 12/10/2014 
* Descrição:  Implemente um jogo de forca. O jogo consiste em fornecer uma 
* palavra secreta. O usuário deve tentar adivinhar as letras e pode errar no 
* máximo 7 vezes. O oitavo erro implica no enforcamento.  
**/ 
public class Exercicio_6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a palavra:");
        String[] word = scan.nextLine().split("");
        
        int errors = 0;
        boolean right;
        String[] player = new String[word.length];
        
        player[0] = "";
        for (int i = 1; i < player.length; i++) {
            player[i] = "_";
        }
        
        while (8 >= errors) {
            System.out.println();
            System.out.println("Digite o seu chute:");
            String guess = scan.next();
            right = false;
            
            for (int i = 1; i < word.length; i++) {
                if (word[i].equals(guess)) {
                    player[i] = guess;
                    right = true;
                } 
            }
            
            System.out.println();
            for (int i = 1; i < player.length; i++) {
                System.out.print(player[i]);
            }
            System.out.println();
            if (Arrays.equals(player, word)) {
                System.out.println("Parabéns você acertou!");
                break;
            } else if (!right) {
                errors++;
            }
        }
        if (errors >= 8) {
            System.out.println("Forca :/");
        }
    }
}
