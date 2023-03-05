package atividades;

import java.util.Scanner;

public class Media_v2{
    public static void main(String[] args) {{
    	//declara��o da variavel scanner
    	Scanner sc = new Scanner(System.in);
    	
    	//declara��o das variaveis usadas.
        int nAlunos;
        double n1, n2, media, maiorMedia = 0, menorMedia = 10, somaMedias = 0;
        String situacao;

        //obten��o do numero de alunos da turma.
        System.out.print("Digite o n�mero de alunos na turma: ");
        nAlunos = sc.nextInt();

        //loop de aquisi��o e calculo
        for (int i = 1; i <= nAlunos; i++) {
            System.out.printf("\nAluno %d\n", i);//impressao da numera�ao do aluno

            System.out.print("Digite a nota 1: ");//impressao e obten�ao da n1
            n1 = sc.nextDouble();

            System.out.print("Digite a nota 2: ");//impressao e obten�ao da n2
            n2 = sc.nextDouble();

            media = (n1 + n2) / 2;//calculo de media
            
            somaMedias += media; //soma das medias para calculo futuro

            //verifica��o da maior media
            if (media > maiorMedia) {
                maiorMedia = media;
            }
            //verifica��o da menor media
            if (media < menorMedia) {
                menorMedia = media;
            }
            
            // if/else para aferir qual a situa��o do aluno
            if (media >= 9) {
                situacao = "Aprovado com Excel�ncia";
            } else if (media >= 6) {
                situacao = "Aprovado";
            } else if (media >= 4) {
                situacao = "Em recupera��o. Precisa fazer a N3";
            } else {
                situacao = "Reprovado";
            }

            System.out.printf("M�dia: %.2f\nSitua��o: %s\n", media, situacao);//impressao da media do aluno + situa��o que ele se encontra
        }

        double mediaTurma = somaMedias / nAlunos; //media da turma

        System.out.printf("\nMaior m�dia: %.2f\n", maiorMedia);//impressao da maior media
        System.out.printf("Menor m�dia: %.2f\n", menorMedia);//impressao da menor media
        System.out.printf("M�dia da turma: %.2f\n", mediaTurma);//impressao da media da turma

        sc.close();//fechamento do scanner
    	}
    }
}