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

    public static boolean jogadaValida(char[][] tabuleiro, int linha, int coluna) {
        if (linha < 0 || linha >= TAMANHO || coluna < 0 || coluna >= TAMANHO) {
            return false;
        }

        return tabuleiro[linha][coluna] == ' ';
    }

    public static char alternarJogador(char jogador) {
        return (jogador == 'X') ? 'O' : 'X';
    }

    public static boolean verificarVencedor(char[][] t, char jogador) {

        for (int i = 0; i < TAMANHO; i++) {
            if (t[i][0] == jogador && t[i][1] == jogador && t[i][2] == jogador) {
                return true;
            }
        }

        for (int i = 0; i < TAMANHO; i++) {
            if (t[0][i] == jogador && t[1][i] == jogador && t[2][i] == jogador) {
                return true;
            }
        }

        if (t[0][0] == jogador && t[1][1] == jogador && t[2][2] == jogador) {
            return true;
        }

        if (t[0][2] == jogador && t[1][1] == jogador && t[2][0] == jogador) {
            return true;
        }

        return false;
    }
}

