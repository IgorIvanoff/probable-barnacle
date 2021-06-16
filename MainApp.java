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
        String player;
        boolean done;
        Auxiliar aux = new Auxiliar();
        int row;
        int column;
        Scanner teclado;
        teclado = new Scanner(System.in);
        board = Auxiliar.init();
        player = " j1 ";
        done = false;
        System.out.print("Jogo do Pontinho!\n");
        while (!done)
        {
            Auxiliar.dump(board);
            System.out.printf("Jogada de: %s\n", player);
            System.out.print("Informe o valor da linha (0,1,2,3,4,5)");
            row = teclado.nextInt();
            while (!(row >= 0 && row <= 6))
            {
                //garanti de valor válido
                System.out.print("\tValor Inválido. Digite novamente");
                row = teclado.nextInt();
            }
            System.out.print("Informe o valor da coluna (0,1,2,3,4,5)");
            column = teclado.nextInt();
            while (!(column >= 0 && column <= 6))
            {
                //garanti de valor válido
                System.out.print("\tValor Inválido. Digite novamente");
                column = teclado.nextInt();
            }
            wrong = Auxiliar.wrong();
            if (board[row][column].equals("   "))
            {
                board[row][column] = player;
            }
            board[row][column] = player;
            if (player.equals(" j1 "))
            {
                player = " j2 ";
            }
            else
            {
                player = " j1 ";
            }
            umponto = Auxiliar.umponto;
        }
        teclado.close();
        System.out.print("**Fim de jogo**\n");
    }
}