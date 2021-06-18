// Direitos Autorais, PUCRS/Escola Politécnica
// 2021-06-11
import java.util.Scanner;
import java.io.IOException;
/**
 * A classe Main permite jogar o jogo do pontinho entre 2 jogadores.
 * O jogo do pontinho consiste em formar quadrados. Cada quadrado formado é 1 ponto para o jogador.
 * Quadrados são formamos a partir de 04 linhas ordenadas.
 * Cada jogada de um jogador representa uma linha escolhida por ele no tabuleiro.
 * Cada quadrado formado recebe a inicial do jogador que o fez.
 * 
 * @author Igor Ivanoff (igorlbivanoff@gmail.com)
 * @version 1.4 (2021-06-16)
 */
public class MainApp
{
    /**
     * Cria os laços de processamento do jogo, enquanto estiver rodando, e
     * de reconhecimento de valores de entrada válidos.
     * Tem as condicionais que identificarão na matriz (classe auxiliar)
     * qual a jogada realizada por cada jogador.
     * Chama os subprogramas da classe auxiliar para identificarem o tabuleiro e os pontinhos marcáveis.
     * @param boolean; o valor lógico identifica se o jogo ainda está em aberto,
     * @param row permite inserir o valor de entrada atribuído para a linha
     * @param column permite inserir o valor de entrada para a coluna
     */

    public static void main(String[] args) throws IOException
    {
        String[][] board;
        String player1;
        String player2;
        boolean done;
        Auxiliar aux = new Auxiliar();
        int row;
        int column;
        Scanner teclado;
        teclado = new Scanner(System.in);
        board = Auxiliar.init();
        player1 = " j1 ";
        player2 = " j2 ";
        done = false;

        System.out.print("Jogo do Pontinho!\n");
        while (!done)
        {
            Auxiliar.dump(board);
            System.out.println("Jogada do player1");
            System.out.print("Informe o valor da linha (0,1,2,3,4,5)");
            row = teclado.nextInt();
            while (!(row >= 0 && row <= 6))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                row = teclado.nextInt();
            }
            System.out.print("Informe o valor da coluna (0,1,2,3,4,5)");
            column = teclado.nextInt();
            while (!(column >= 0 && column <= 6))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da coluna");
                column = teclado.nextInt();
            }
            if (board[row][column].equals("   "))
            {
                board[row][column] = player1;
                player1 = "j1";
            }
            while (board[row][column].equals("j2"))
            {
                System.out.println("Ponto já marcado pelo outro jogador.");
                System.out.print("Informe outro valor para a linha (0,1,2,3,4,5)");
                row = teclado.nextInt();
                while (!(row >= 0 && row <= 6))
                {
                    System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                    row = teclado.nextInt();
                }
                System.out.print("Informe outro valor para a coluna (0,1,2,3,4,5)");
                column = teclado.nextInt();
                while (!(column >= 0 && column <= 6))
                {
                    System.out.print("\tValor Inválido. Digite novamente outro valor para a coluna");
                    column = teclado.nextInt();
                }
            }
            board[row][column] = player1;
            Auxiliar.dump(board);
            System.out.println("Jogada do player2");
            System.out.print("Informe o valor da linha (0,1,2,3,4,5)");
            row = teclado.nextInt();
             while (!(row >= 0 && row <= 6))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                row = teclado.nextInt();
            }
            System.out.print("Informe o valor da coluna (0,1,2,3,4,5)");
            column = teclado.nextInt();
            while (!(column >= 0 && column <= 6))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da coluna");
                column = teclado.nextInt();
            }
            if (board[row][column].equals("   "))
            {
                board[row][column] = player2;
                player2 = "j2";
            }
            while (board[row][column].equals("j1"))
            {
                System.out.println("Ponto já marcado pelo outro jogador. Digite Novamente");
                System.out.print("Informe o novo valor da linha (0,1,2,3,4,5)");
                row = teclado.nextInt();
                while (!(row >= 0 && row <= 6))
                {
                    System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                    row = teclado.nextInt();
                }
                System.out.print("Informe outro valor para a coluna (0,1,2,3,4,5)");
                column = teclado.nextInt();
                while (!(column >= 0 && column <= 6))
                {
                    System.out.print("\tValor Inválido. Digite novamente o valor da coluna");
                    column = teclado.nextInt();
                }
            }
            board[row][column] = player2;
        }
        teclado.close();
        System.out.print("**Fim de jogo**\n");
    }
}