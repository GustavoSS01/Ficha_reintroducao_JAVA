package atividades;

import java.util.Scanner;

public class Media_v2{
    public static void main(String[] args) {{
    	//declaração da variavel scanner
    	Scanner sc = new Scanner(System.in);
    	
    	//declaração das variaveis usadas.
        int nAlunos;
        double n1, n2, media, maiorMedia = 0, menorMedia = 10, somaMedias = 0;
        String situacao;

        //obtenção do numero de alunos da turma.
        System.out.print("Digite o número de alunos na turma: ");
        nAlunos = sc.nextInt();

        //loop de aquisição e calculo
        for (int i = 1; i <= nAlunos; i++) {
            System.out.printf("\nAluno %d\n", i);//impressao da numeraçao do aluno

            System.out.print("Digite a nota 1: ");//impressao e obtençao da n1
            n1 = sc.nextDouble();

            System.out.print("Digite a nota 2: ");//impressao e obtençao da n2
            n2 = sc.nextDouble();

            media = (n1 + n2) / 2;//calculo de media
            
            somaMedias += media; //soma das medias para calculo futuro

            //verificação da maior media
            if (media > maiorMedia) {
                maiorMedia = media;
            }
            //verificação da menor media
            if (media < menorMedia) {
                menorMedia = media;
            }
            
            // if/else para aferir qual a situação do aluno
            if (media >= 9) {
                situacao = "Aprovado com Excelência";
            } else if (media >= 6) {
                situacao = "Aprovado";
            } else if (media >= 4) {
                situacao = "Em recuperação. Precisa fazer a N3";
            } else {
                situacao = "Reprovado";
            }

            System.out.printf("Média: %.2f\nSituação: %s\n", media, situacao);//impressao da media do aluno + situação que ele se encontra
        }

        double mediaTurma = somaMedias / nAlunos; //media da turma

        System.out.printf("\nMaior média: %.2f\n", maiorMedia);//impressao da maior media
        System.out.printf("Menor média: %.2f\n", menorMedia);//impressao da menor media
        System.out.printf("Média da turma: %.2f\n", mediaTurma);//impressao da media da turma

        sc.close();//fechamento do scanner
    	}
    }
}