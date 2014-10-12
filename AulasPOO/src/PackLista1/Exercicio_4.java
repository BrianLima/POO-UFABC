package PackLista1;

import java.util.Scanner;

/** 
* Exercicio 4
* Autor: Brian Lima 
* Data: 12/10/2014 
* Descrição: Leia um número e escreva se ele "é primo" ou "não é primo". 
**/ 
public class Exercicio_4 {
    public static void main(String args[]){
        System.out.println("Digite o numero para verificar se é primo ou não:");
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean primo = true;
        
        for (int i = n-1; i > 1; i--) {
            if (n%i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("O numero " + n + " é primo");
        } else {
            System.out.println("O numero " + n + " não é primo");
        }
    }
}
