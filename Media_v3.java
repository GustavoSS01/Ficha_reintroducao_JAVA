package atividades;

import java.util.Scanner;

public class Media_v3 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        // Define o tamanho da turma
        System.out.print("Quantos alunos tem na turma? ");
        int numAlunos = sc.nextInt();
        
        // Declara os arrays de nomes e notas
        String[] nomes = new String[numAlunos];
        double[] n1 = new double[numAlunos];
        double[] n2 = new double[numAlunos];
        double[] medias = new double[numAlunos];
        
        // Pede as notas e os nomes de cada aluno
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Nota 1: ");
            n1[i] = sc.nextDouble();
            System.out.print("Nota 2: ");
            n2[i] = sc.nextDouble();
            
            
            // Calcula a média do aluno
            medias[i] = (n1[i] + n2[i]) / 2;
        }
        
        sc.close();
        
        // Encontra a maior e a menor média
        double maiorMedia = 0;
        double menorMedia = 10;
        for (int i = 0; i < numAlunos; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
            }
        }
        
        // Calcula a média da turma
        double mediaTurma = 0;
        for (int i = 0; i < numAlunos; i++) {
            mediaTurma += medias[i];
        }
        mediaTurma /= numAlunos;
        
        // Exibe os resultados
        System.out.println("Maior média: " + maiorMedia);
        System.out.println("Menor média: " + menorMedia);
        System.out.println("Média da turma: " + mediaTurma);
        
        for (int i = 0; i < numAlunos; i++) {
            String situacao;
            if (medias[i] >= 9) {
                situacao = "Aprovado com excelência";
            } else if (medias[i] >= 6) {
                situacao = "Aprovado";
            } else if (medias[i] >= 4) {
                situacao = "Recuperação";
            } else {
                situacao = "Reprovado";
            }
            System.out.println(nomes[i] + ": " + situacao);
        }
    }
}