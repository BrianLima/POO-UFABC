/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackLista1;

import java.util.Scanner;

/** 
* Exercicio 7 
* Autor: Brian Lima 
* Data: 14/10/2014 
* Descrição: Implemente um programa em Java que calcule os dígitos verificadores
* do CPF. O CPF é composto por 11 dígitos, sendo que os dois últimos são os 
* dígitos de verificação. Supondo que os dígitos do CPF sejam representados por 
* a b c d e f g h i - d1 d2, para o cálculo de d1 faz-se: 
* d1 = (a x 1) + (b x 2) + (c x 3) + (d x 4) + (e x 5) + (f x 6) + (g x 7) +  
* (h x 8)  + (i x 9) . 
* A soma d1 deve ser operada com módulo 11 (resto da divisão por 11), 
* e o resultado representa o dígito verificador, se o resultado for 10, 
* toma-se por 0. 
* d2 = (a x 0) + (b x 1) + (c x 2) + (d x 3) + (e x 4) + (f x 5) + (g x 6) +  
* (h x 7)  + (i x 8) + (d1 x 9). 
* A soma d2 deve ser operada com módulo 11 (resto da divisão por 11), e o 
* resultado representa o dígito verificador, se o resultado for 10, toma-se por 0.
**/ 

public class Exercicio_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o inicio do cpf:");
        int cpf = scan.nextInt();
        
        /*if (cpf > 999999999) {
        
        }*/
    }
}
