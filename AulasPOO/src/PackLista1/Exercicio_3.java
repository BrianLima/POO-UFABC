package PackLista1;

import java.util.Arrays;
import java.util.Scanner;

/** 
* Exercicio 3 
* Autor: Brian Lima 
* Data: 12/10/2014 
* Descrição: Leia a nota de 5 alunos e imprima: a maior nota, a menor nota, 
* a média, o número de alunos com nota maior igual a 6.0, o número de alunos com
* nota maior igual a 8.0, a quantidade de alunos que tirou nota menor que 4.0.
**/ 
public class Exercicio_3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int[] students = new int[5];
        int total6 = 0, total8 = 0, total4 = 0;
        float average = 0;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Digite a nota do" + (i + 1) + "º Aluno");
            students[i] = scan.nextInt();
            average += students[i];
            if (students[i] >= 6) {
                total6++;
            } else if (students[i] >= 8) {
                total8++;
            } else if (students[i] < 4) {
                total4++;
            }
        }

        average = average / students.length;

        Arrays.sort(students);

        System.out.println("A maior nota foi " + students[4]
                + ", a menor foi " + students[0]
                + ", a média foi " + average + ", "
                + total4 + " alunos obtiveram uma nota menor que 4, "
                + total6 + " alunos obtiveram uma nota maior ou igual a 6 e "
                + total8 + " alunos obtiveram uma nota maior do que 8");
    }
}
