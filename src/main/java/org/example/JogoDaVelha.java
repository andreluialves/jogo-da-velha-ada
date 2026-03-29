package org.example;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        inicializarTabuleiro(tabuleiro);
        char jogadorAtual = 'X';

        System.out.print("Linha (0-2): ");
        int linha = sc.nextInt();

        System.out.print("Coluna (0-2): ");
        int coluna = sc.nextInt();
    }

    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public static void mostrarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            System.out.println(tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
            if (i < 2) {
                System.out.println("--+---+--");
            }
        }
    }

    public static char alternarJogador(char jogador) {
        return (jogador == 'X') ? 'O' : 'X';
    }
}

